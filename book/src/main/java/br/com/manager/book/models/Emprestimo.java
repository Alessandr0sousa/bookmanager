package br.com.manager.book.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.w3c.dom.Notation;
@Entity
public class Emprestimo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(optional = true, fetch = FetchType.EAGER) 
	@JoinColumn(name = "livro_id")
	private Livro livro;
	@ManyToOne(optional = true, fetch = FetchType.EAGER) 
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	private LocalDateTime dataEmprestimo = LocalDateTime.now();
	private LocalDateTime dataDevolucao = LocalDateTime.now().plusDays(10);
	@Enumerated(EnumType.STRING)
	private StatusEmprestimo statusEmprestimo = StatusEmprestimo.No_Prazo;
	
	public Emprestimo() {
	}
	
	public Emprestimo(Long id, Livro livro, Usuario usuario, LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao,
			StatusEmprestimo statusEmprestimo) {
		this.id = id;
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.statusEmprestimo = statusEmprestimo;
	}
	

	public Emprestimo(Long livro2, Long usuario2) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public StatusEmprestimo getStatusEmprestimo() {
		return statusEmprestimo;
	}
	public void setStatusEmprestimo(StatusEmprestimo statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}
	
}
