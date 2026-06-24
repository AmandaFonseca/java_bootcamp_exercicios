package com.amanda.cursoJava.aula77;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// Instancia o objeto de acesso a dados (DAO) para 
		//podermos buscar os contatos
		ContatoDAO contatoDAO = new ContatoDAO();
		
		//Executa a busca pelo nome "Taylor". 
		//O resultado vem envelopado em um Optional,o que significa 
		//que o objeto 'contato' pode conter um Contato ou estar vazio.
	    Optional<Contato> contato = contatoDAO.buscarNome("Taylor");
	    
	    // O método ifPresentOrElse recebe duas expressões Lambda e 
	    //decide o que fazer:
	    contato.ifPresentOrElse(
	        // Parte 1 (Se presente): 'c' representa o Contato encontrado. 
	        // Ele entra aqui e imprime o nome do contato no console.
	        c -> System.out.println(c.getNome()),
	        
	        // Parte 2 (Se vazio): Se o Optional estiver vazio, 
	        //executa esta segunda Lambda.
	        // Como não há contato, ela chama o método do DAO para 
	        //criar um contato padrão.
	        () -> contatoDAO.criarContatoPadrao()
	    );
		
	}

}
