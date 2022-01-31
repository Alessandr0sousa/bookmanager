package br.com.manager.book.controllers;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.manager.book.dto.LivroDto;
import br.com.manager.book.dto.LivroForm;
import br.com.manager.book.models.Livro;
import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.LivroRepository;
@RestController
@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private LivroRepository livroRepository; 
	@GetMapping
	public List<LivroDto> listar() {
		return LivroDto.converter(livroRepository.findAll());
	}

	@GetMapping("/{titulo}")
	public List<Livro> listar(@PathVariable String titulo) {
		List<Livro> livros;
		livros = livroRepository.findByTituloContains(titulo);
		return livros;
	}

	@PostMapping
	@Transactional
	public ResponseEntity<Livro> cadastrar(@RequestBody(required = true) @Valid LivroForm form, UriComponentsBuilder uriBuilder){
		Usuario user =  new Usuario(1L, null, null, null, null);
		form.setUsuario(user);
		Livro livros = form.converter(livroRepository);	
		livroRepository.save(livros);
		URI uri = uriBuilder.path("/livros/{id}").buildAndExpand(livros.getId()).toUri();
		return ResponseEntity.created(uri).body(livros);
	}
}