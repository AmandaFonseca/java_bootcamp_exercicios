package com.amanda.cursoJava.aula28;


public class main {

	public static void main(String[] args) {
		// 1. O objeto nasce como Aluno, mas é guardado como Pessoa 
		//(Upcasting)
		Pessoa pessoa1 = new Pessoa();
		Aluno aluno1 = new Aluno();
		Professor Professor1 = new Professor();

		System.out.println(pessoa1 instanceof Aluno);     // Retorna true
		System.out.println(pessoa1 instanceof Professor); // Retorna false
		System.out.println(pessoa1 instanceof Pessoa);    // Retorna true (porque Aluno herda de Pessoa)
		
	}
}