package com.amanda.cursoJava.aula18;

public class main {

	public static void main(String[] args) {
		double[] notas = {10,8};
		Aluno aluno1 = new Aluno("Aisha", "989744490", notas);

		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getNotas()[0]);
	}
}