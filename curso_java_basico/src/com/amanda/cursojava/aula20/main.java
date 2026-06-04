package com.amanda.cursojava.aula20;

public class main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco()); 
		// Nota: na imagem está obterEtiquetaEndereco
		System.out.println(professor.obterEtiquetaEndereco());
	}
}