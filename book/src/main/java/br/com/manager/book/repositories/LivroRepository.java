package br.com.manager.book.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.manager.book.models.Livro;
@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	List<Livro> findByTituloContains(String titulo);
	
}

