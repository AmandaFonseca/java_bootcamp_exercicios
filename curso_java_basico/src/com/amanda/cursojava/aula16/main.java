package com.amanda.cursojava.aula16;

public class main {

	public static void main(String[] args) {
		
		//Carro car = new Carro("Ferrari", 50, 20);
		
		System.out.println("Total: " + Carro.totalCarrosCriados);
		double kmConvertido = Carro.converterKmParaMilhas(5);
		System.out.println(kmConvertido);
	}
}