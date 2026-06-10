package com.amanda.cursoJava.aula19;

public class Heroi {
	// Todo mundo vê: todas os pacotes, classes, subclasses v
	public String nomePublico;      
	
	// Só o pacote atual e as classes filhas vêem
    protected String poderProtected;   
    
    // Só quem está neste pacote vê (sem palavra-chave)
    String trajeDefault;      
    
    // SÓ a classe Heroi vê!
    private String identidadeSecreta;  

    public Heroi() {
        // Dentro da própria classe, todos têm acesso (S, S, S, S na tabela)
        this.nomePublico = "Superman";
        this.poderProtected = "Super força";
        this.trajeDefault = "Capa Azul e Vermelha";
        this.identidadeSecreta = "Clark Kent";
    }

}