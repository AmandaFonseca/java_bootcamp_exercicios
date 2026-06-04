package com.amanda.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = scan.nextLine();
		System.out.println("Seu nome completo é "+ nome);
	}

}
