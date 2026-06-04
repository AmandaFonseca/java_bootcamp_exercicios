package com.amanda.cursojava.aula26;

public abstract class Animal {
	protected String nome; // Estado comum

	public Animal(String nome) {this.nome = nome;}
	
	public void respirar() {
		// Lógica pronta compartilhada
        System.out.println(nome + " respirou oxigênio."); 
	}
	// Obrigatório implementar na classe filha
	public abstract void emitirSom(); 
}