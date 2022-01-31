package br.com.manager.book.dto;

import org.springframework.lang.NonNull;

import br.com.manager.book.models.Livro;
import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.LivroRepository;

//import br.com.manager.book.models.Usuario;

public class LivroForm {
	
	private String titulo;
	@NonNull
	private String autor;
	@NonNull
	private String editora;
	@NonNull
	private String edicao;
	@NonNull
	private Integer ano;
	@NonNull
	private String categoria;
	@NonNull
	private Integer qtd;
	private Usuario usuario;
	
	
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Livro converter(LivroRepository livroRepository) {
		
		return new Livro(titulo, autor, editora, edicao, ano, categoria, qtd, usuario);
	
	}
	
}
