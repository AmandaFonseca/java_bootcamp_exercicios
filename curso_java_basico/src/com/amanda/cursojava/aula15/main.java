package com.amanda.cursoJava.aula15;

public class main {

	public static void main(String[] args) {
		
		Carro car = new Carro("Ferrari", 50, 20);
		
		System.out.println("Marca do carro: " + car.getMarca());
		double litrosNecessarios = car.calcularCombustivel(100);
		System.out.println("Combustível necessário para 100 km: " + litrosNecessarios + " litros");
	}
}