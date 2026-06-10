package com.amanda.cursoJava.aula17;

public class Contato {
	private String nome;
	
	//Relacionamento entre Classes
	private Endereco endereco;
	private Telefone [] telefones;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone[] getTelefone() {
		return telefones;
	}
	public void setTelefone(Telefone[] telefones) {
		this.telefones = telefones;
	}

}