package br.com.manager.book.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.manager.book.models.Livro;

public class LivroDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private String autor;
	private String editora;
	private String edicao;
	private Integer ano;
	private String categoria;
	private Integer qtd;
	
	public LivroDto() {}

	public LivroDto(Livro livros) {
		this.id = livros.getId();
		this.titulo = livros.getTitulo();
		this.autor = livros.getAutor();
		this.editora = livros.getEditora();
		this.edicao = livros.getEdicao();
		this.ano = livros.getAno();
		this.categoria = livros.getCategoria();
		this.qtd = livros.getQtd();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public Integer getAno() {
		return ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public Integer getQtd() {
		return qtd;
	}
	
	public static List<LivroDto> converter(List<Livro> livros){
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}
}
