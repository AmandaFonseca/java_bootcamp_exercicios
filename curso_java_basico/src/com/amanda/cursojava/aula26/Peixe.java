package com.amanda.cursojava.aula26;

//O Peixe É UM Animal e CONSEGUE apenas Nadar
public class Peixe extends Animal implements Nadador {
	 public Peixe(String nome) { super(nome); }

	 public void emitirSom() { System.out.println("Glub glub."); }
	 public void nadar() { System.out.println("Peixe nadando rápido."); }
	}
