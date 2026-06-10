package com.amanda.cursoJava.aula15;

public class Carro {
    // Atributos PRIVADOS: ninguém de fora pode alterá-los diretamente
    private String marca;
    private double capCombustivel;
    private double consumoCombustivel;

    // Construtor PÚBLICO: permite criar o carro de fora da classe
    public Carro(String marca, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    // Método PÚBLICO: qualquer um pode pedir para calcular
    public double calcularCombustivel(double km) {
        return km / this.consumoCombustivel;
    }

    // --- GETTERS E SETTERS (Os "porteiros" dos atributos) ---

    // Permite que visualizem a marca (Apenas leitura)
    public String getMarca() {
        return this.marca;
    }

    // Permite alterar a capacidade do combustível, mas COM VALIDAÇÃO!
    public void setCapCombustivel(double capCombustivel) {
        if (capCombustivel > 0) { // Proteção: impede capacidade negativa!
            this.capCombustivel = capCombustivel;
        } else {
            System.out.println("Erro: A capacidade deve ser maior que zero.");
        }
    }
}