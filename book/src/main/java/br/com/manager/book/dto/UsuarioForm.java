package br.com.manager.book.dto;

import org.springframework.lang.NonNull;

import br.com.manager.book.models.Usuario;
import br.com.manager.book.repositories.UsuarioRepository;

public class UsuarioForm {

	@NonNull
	private String nome;
	@NonNull
	private String cpf;
	@NonNull
	private String email;
	@NonNull
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario converter(UsuarioRepository usuarioRepository) {
		return new Usuario(null, nome, cpf, email, senha);
	}
}
