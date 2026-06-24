package com.amanda.cursoJava.aula77;

import com.amanda.cursoJava.aula17.Endereco;
import com.amanda.cursoJava.aula17.Telefone;

public class Contato {

	private String nome;
	
	public Contato(String nome) {
		super();
		this.nome = nome;
	}
	
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