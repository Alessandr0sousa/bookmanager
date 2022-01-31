package br.com.manager.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.manager.book.models.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	
	
}
