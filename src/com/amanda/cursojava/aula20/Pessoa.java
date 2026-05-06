package com.amanda.cursojava.aula20;

public abstract class  Pessoa {
	private String nome;
    private int idade;
 
    protected String cpf;
    
    
    String visibilidade;
    
    public String visibilidadePublica;

    public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public  void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    public String getCpf() {
        return cpf;
    }
    
    public abstract String obterNome();

}