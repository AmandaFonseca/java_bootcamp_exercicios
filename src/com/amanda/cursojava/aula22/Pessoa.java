package com.amanda.cursojava.aula22;

public class Pessoa {
	public  String nome;
    private int idade;
    protected String cpf;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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
	
/*Sobrescrever o toString()permite que você defina uma representação legível 
 * do seu objeto, ou seja, quando você imprime o objeto, ao invés de sair um 
 * monte de informações internas (como o endereço de memória), ele mostra os 
 * valores dos atributos de forma clara. */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}