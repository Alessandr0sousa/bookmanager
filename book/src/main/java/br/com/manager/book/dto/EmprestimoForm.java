package br.com.manager.book.dto;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

import br.com.manager.book.models.Emprestimo;
import br.com.manager.book.models.Livro;
import br.com.manager.book.models.StatusEmprestimo;
import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.EmprestimoRepository;
import br.com.manager.book.repositories.LivroRepository;
import br.com.manager.book.repositories.UsuarioRepository;

public class EmprestimoForm {
	@NonNull
	private Long livro;
	@NonNull
	private Long usuario;

	public Long getLivro() {
		return livro;
	}
	public Long getUsuario() {
		return usuario;
	}
	public void setLivro(Long livro) {
		this.livro = livro;
	}
	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

	public Livro atualizarQtd(Long livro, LivroRepository livroRepository) {
		Livro lvr = livroRepository.getById(livro);
		Integer qtd = lvr.getQtd();
		lvr.setQtd(qtd -1);
		return lvr;
	}

	public Emprestimo converter( LivroRepository livroRepository, UsuarioRepository usuarioRepository) {

		return new Emprestimo( livro, usuario);
		
	}

}
