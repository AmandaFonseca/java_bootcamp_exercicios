package com.amanda.cursoJava.aula26;

//O Pato É UM Animal e CONSEGUE Voar e Nadar
public class Pato extends Animal implements Voador, Nadador {
	
 public Pato(String nome) { super(nome); }

 public void emitirSom() { System.out.println("Quack!"); }
 public void voar() { System.out.println("Pato voando baixo."); }
 public void nadar() { System.out.println("Pato nadando no lago."); }
}


