package com.amanda.cursojava.aula14;

public class Carro {
    // Atributos PRIVADOS: ninguém de fora pode alterá-los diretamente
    private String marca;
	private double capCombustivel;
    private double consumoCombustivel;
    
    public String getMarca() {
		return marca;
	}
    
    // Construtor PÚBLICO: permite criar o carro de fora da classe
    public Carro(String marca, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}






}