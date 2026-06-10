package com.amanda.cursoJava.aula16;

public class Atendente extends Usuario {
    public Atendente(String nome, String email, String senha, String cargo, boolean logado, boolean administrador) {
        super(nome, email, senha, cargo, logado, administrador);
    }

    double valorCaixa = 0;

    public void valorCaixa(double valorCaixa) {
        this.valorCaixa = +valorCaixa;
        System.out.println("Valor de Caixa: " + valorCaixa);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - email: " + email + " - cargo: " + cargo + " - administrador: " + administrador
                + " - Valor em caixa: "
                + valorCaixa;
    }
}