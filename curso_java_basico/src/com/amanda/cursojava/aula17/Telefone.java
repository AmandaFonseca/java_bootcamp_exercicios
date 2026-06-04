package com.amanda.cursojava.aula17;

public class Telefone {
	// Atributos privados (Encapsulamento)
    private String tipo; // Ex: Celular, Fixo, Trabalho
    private String ddd;
    private String numero;

    // Construtor Padrão (Sem parâmetros)
    public Telefone() {
    }

    // Construtor Completo (Para facilitar a criação do objeto)
    public Telefone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    // --- Métodos Getters e Setters ---

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    // Método útil para exibir o telefone formatado
    public String obterTelefoneFormatado() {
        return "(" + this.ddd + ") " + this.numero;
    }
}
