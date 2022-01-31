package br.com.manager.book.controllers;

import java.net.URI;
import java.util.List;

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

import br.com.manager.book.dto.UsuarioForm;
import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository; 
	
	@GetMapping
	public List<Usuario> listar() {
		List<Usuario> usuarios;
		usuarios = usuarioRepository.findAll();
		return usuarios;
	}
	
	@GetMapping("/{nome}")
	public List<Usuario> listar(@PathVariable String nome) {
		List<Usuario> usuarios;
		usuarios = usuarioRepository.findByNomeContains(nome);
		return usuarios;
	}
	
	@PostMapping
	private ResponseEntity<Usuario> cadastrar(@RequestBody(required = true) @Valid UsuarioForm form, UriComponentsBuilder uriBuilder) {
		Usuario usuarios = form.converter(usuarioRepository);
		usuarioRepository.save(usuarios);
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarios.getId()).toUri();
		return ResponseEntity.created(uri).body(usuarios);
	}
	
}
