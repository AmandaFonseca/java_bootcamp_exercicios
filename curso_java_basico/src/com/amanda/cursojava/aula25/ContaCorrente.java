package com.amanda.cursojava.aula25;

public class ContaCorrente extends ContaBancaria {

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= (valor +2.0);
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	void  setSaldo(double saldo) {
		this.saldo= saldo;
	}
}
