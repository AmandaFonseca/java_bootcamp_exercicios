package com.amanda.cursojava.aula21;

public class TesteConstantes {

	public static void main(String[] args) {
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "http://loiane.com/br";
		System.out.println(Constantes.URL_BLOG);
		//não é possivel alterar é uma constante;
		//Constantes.URL_CURSO_COMPLETO = "http://loiane.com/br";
	}

}
