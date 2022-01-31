package br.com.manager.book.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;
import org.w3c.dom.Notation;
@Entity
public class Livro {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String autor;
	private String editora;
	private String edicao;
	private Integer ano;
	private String categoria;
	private Integer qtd;
	@ManyToOne
	private Usuario usuario;
	private LocalDateTime dataInsert = LocalDateTime.now();
	private LocalDateTime dataUpdate = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusLivro statusLivro = StatusLivro.Disponivel;
	
	public Livro() {}
	
	public Livro(String titulo, String autor, String editora, String edicao, Integer ano, String categoria,
			@NotEmpty Integer qtd, Usuario usuario) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
		this.ano = ano;
		this.categoria = categoria;
		this.qtd = qtd;
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getCategoria() {
		return categoria;
	}

	public Integer getQtd() {
		return qtd;
	}

	public LocalDateTime getDataUpdate() {
		return dataUpdate;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public void setDataUpdate(LocalDateTime dataUpdate) {
		this.dataUpdate = dataUpdate;
	}

	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDateTime getDataInsert() {
		return dataInsert;
	}
	public void setDataInsert(LocalDateTime dataInsert) {
		this.dataInsert = dataInsert;
	}
	public StatusLivro getStatusLivro() {
		return statusLivro;
	}
	public void setStatusLivro(StatusLivro statusLivro) {
		this.statusLivro = statusLivro;
	}
	
}
