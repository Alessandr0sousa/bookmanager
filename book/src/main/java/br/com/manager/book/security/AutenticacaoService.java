package br.com.manager.book.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repository.findByCpf(username);
		System.out.println(usuario);
		if (usuario.isPresent()) {
			return usuario.get();
		} 
		throw new UsernameNotFoundException("Dados inváldos!");
	}
	
}
