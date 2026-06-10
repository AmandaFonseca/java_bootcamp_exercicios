package com.amanda.cursoJava.aula14;

import java.util.Scanner;

public class ListaExerciciosParte3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe ganho por hora");
		double valorHora = scan.nextDouble();
		System.out.println("Informe horas trabalhadas");
		int horas = scan.nextInt();
		double salBruto = valorHora * horas;
		double descontoInss = salBruto * 0.08;
		double descontoImpostoRenda =   salBruto * 0.11;
		double descontoSindicato =   salBruto * 0.05;
		double salLiquido = salBruto - (descontoImpostoRenda + descontoInss + descontoSindicato);
		System.out.println("Salário Líquido"+ salLiquido);
		
		double tamArquivo = 600;
		int internet = 500;
		double resultado =  ((tamArquivo*8)/internet)/60;
		System.out.println(resultado);
		scan.close();

	}

}
