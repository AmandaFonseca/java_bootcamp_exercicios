package com.amanda.cursoJava.aula08;

public class Carro {
		String marca;
		String modelo;
		double numPassageiro;
		double capCombustivel;
		double consumoCombustivel; // Ex: quantos km o carro faz por litro (km/l)
		
		Carro(String marca){
			System.out.println("Classe instanciada");
			numPassageiro = 4;
			this.marca = marca;
			
		}
		
		String obterMarca() {
			return this.marca;
		}
		
		double calcularCombustivel(double km) {
			double qtdCombustivel = km / this.consumoCombustivel;
			return qtdCombustivel;
		}
}
