package com.amanda.cursoJava.aula16;

public class Familia extends Ingresso {
    int numeroPessoa = 0;

    public Familia(String nome, boolean dublado, boolean legendado, int numeroPessoa2) {
        super(nome, dublado, legendado);
        this.numeroPessoa = numeroPessoa;
        verificaNumeroPessoa(super.valor);	}

	public void verificaNumeroPessoa(double valor) {
        if (this.numeroPessoa >= 3) {
            double valorTotal = (getValor() * 3);
            double desconto = valorTotal * 0.05;
            setValor(valorTotal - desconto);
        }
    }
}