package com.amanda.cursoJava.aula10;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = scan.nextLine();
		System.out.println("Seu nome completo é "+ nome);
	}

}