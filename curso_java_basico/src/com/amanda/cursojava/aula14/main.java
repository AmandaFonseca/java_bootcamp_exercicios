package com.amanda.cursojava.aula14;

public class main {

	public static void main(String[] args) {
		
		Carro car = new Carro("Ferrari", 510, 20);
		
		System.out.println("Marca do carro: " + car.getMarca());
		double litrosNecessarios = car.getCapCombustivel();
		System.out.println("Combustível necessário para 100km: " + litrosNecessarios + " litros");
	}
}