package com.amanda.cursojava.aula16;

public class Carro {
	// Atributos normais (cada carro tem o seu)    
	private String marca;
    private double capCombustivel;
    private double consumoCombustivel;
    // Atributo STATIC: compartilhado por TODOS os carros criados
    public static int totalCarrosCriados = 0;

    public Carro(String marca, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return km / this.consumoCombustivel;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setCapCombustivel(double capCombustivel) {
        if (capCombustivel > 0) { 
            this.capCombustivel = capCombustivel;
        } else {
            System.out.println("Erro: A capacidade deve ser maior que zero.");
        }
    }
    
 // Método STATIC: Você não precisa de um carro para usá-lo
    public static double converterKmParaMilhas(double km) {
        return km * 0.621371;
    }
}