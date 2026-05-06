package com.amanda.cursojava.aula23;

import java.util.Scanner;

/*
 * O que significa o número (0)?

É o código de saída do programa.

0 → terminou com sucesso ✅
qualquer outro número → terminou com erro ❌ (ex: System.exit(1))

Esse código é útil quando o programa é chamado por outro sistema ou 
script.
 * 
 * */
public class TesteSystemExit {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Digite sua idade:");
	        int idade = scan.nextInt();

	        if (idade > 120 ) {
	            System.out.println("Idade inválida!");
	            System.exit(0); // encerra aqui
	        }

	        System.out.println("Idade válida");
	    }
}
