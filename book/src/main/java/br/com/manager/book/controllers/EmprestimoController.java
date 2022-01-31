package br.com.manager.book.controllers;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.manager.book.dto.EmprestimoForm;
import br.com.manager.book.models.Emprestimo;
import br.com.manager.book.models.Livro;
import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.EmprestimoRepository;
import br.com.manager.book.repositories.LivroRepository;
import br.com.manager.book.repositories.UsuarioRepository;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
	@Autowired
	private EmprestimoRepository emprestimoRepository;
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Emprestimo> listar() {
		List<Emprestimo> emprestimo;
		emprestimo = emprestimoRepository.findAll();
		return emprestimo;
	}
	
	@Transactional
	@PostMapping
	private ResponseEntity<Emprestimo> cadastrar(@RequestBody @Valid EmprestimoForm form, UriComponentsBuilder uriBuilder) {
		Emprestimo emprestimo = new Emprestimo();
//		Livro livro = livroRepository.getById(form.getLivro());
//		Usuario usuario = usuarioRepository.getById(form.getUsuario());
//		livro = form.atualizarQtd(form.getLivro(), livroRepository);
//		form.atualizarQtd(form.getLivro(), livroRepository);
//		emprestimo.setLivro(livro);
//		emprestimo.setUsuario(usuario);
		emprestimo = form.converter(livroRepository, usuarioRepository);
		emprestimoRepository.save(emprestimo); 
		URI uri = uriBuilder.path("/emprestimos/{id}").buildAndExpand(emprestimo.getId()).toUri();
		return ResponseEntity.created(uri).body(emprestimo);
	}
	
//	@PutMapping
//	public ResponseEntity<Emprestimo> cadEmpretimo(@RequestBody EmprestimoForm emprestimoForm) {
//		Emprestimo emprestimo;
//		emprestimo.
//		return null;
//	}
	
}
