package com.amanda.cursojava.aula13;

public class main {

	public static void main(String[] args) {
		
		Carro car = new Carro("Ferrari");
		car.capCombustivel = 50;
		car.consumoCombustivel = 8;
		
		System.out.println("Marca do carro: " + car.obterMarca());
		double litrosNecessarios = car.calcularCombustivel(100);
		System.out.println("Combustível necessário para 100km: " + litrosNecessarios + " litros");
		System.out.println(car.numPassageiro);
	}
}