package com.amanda.cursojava.aula18;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	// Construtor da classe mãe
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}