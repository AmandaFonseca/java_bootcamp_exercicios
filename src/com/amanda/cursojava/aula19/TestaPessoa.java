package com.amanda.cursojava.aula19;

import com.amanda.cursojava.aula19.teste.Aluno;

public class TestaPessoa {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(null, 0, null, null, null, null, null, null);
		Professor professor = new Professor(null, 0, null, null, null, null, null, 0);
		aluno.setNome("Aisha jr");
		System.out.println(aluno.getNome());
		
		professor.setNome("Aisha");
		System.out.println(professor.getNome());
	}
}
