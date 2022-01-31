package br.com.manager.book.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.manager.book.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	List<Usuario> findByNomeContains(String nome);
	
 	Optional<Usuario> findByCpf(String cpf);
	
}
