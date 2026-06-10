package com.amanda.cursoJava.aula25;

//Classe abstrata: serve apenas como modelo base
abstract class ContaBancaria {
	protected double saldo;
	
	  // Método comum: todas as filhas usam o mesmo código
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método abstrato: cada filha DEVE implementar a sua lógica
    public abstract void sacar(double valor);
}
