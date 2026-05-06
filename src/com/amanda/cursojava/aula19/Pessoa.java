package com.amanda.cursojava.aula19;

public class Pessoa {
/* Classe: Uma classe é uma receita que define atributos (variáveis) e 
 * comportamentos (métodos) de um objeto.
* 
* Herança: Herança permite criar uma nova classe (classe filha) a partir 
* de uma classe existente (classe mãe). A classe filha herda atributos e 
* métodos da classe mãe. Para herdar, usamos a palavra reservada extends.
* 
* Modificadores de Acesso:
* - public: Atributos/métodos acessíveis por qualquer classe, em qualquer pacote.
* - default: Atributos e métodos acessíveis somente dentro do mesmo pacote.
* - private: Atributos e métodos acessíveis apenas dentro da própria classe pai.
* - protected: Atributos e métodos acessíveis na própria classe, no pacote, 
* e em subclasses, mesmo que fora do pacote.
     
 * Construtor da Classe Filha:  A classe filha pode ter seu próprio construtor, 
 * mas deve chamar o construtor da classe mãe com a palavra reservada super.

* Encapsulamento: O encapsulamento garante que os dados da classe fiquem protegidos, 
* controlando o acesso através de métodos públicos, mantendo a integridade.
* */
	
	private String nome;
    private int idade;
    //protected: Atributos e métodos acessíveis na própria classe, no pacote, 
    //e em subclasses, mesmo que fora do pacote.    
    protected String cpf;
    
    private String endereco;
    private String telefone;
    
    String visibilidade;
    
    public String visibilidadePublica;

    public Pessoa(String nome, int idade, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    public String getCpf() {
        return cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}