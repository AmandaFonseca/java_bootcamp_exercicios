package com.amanda.cursojava.aula25;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(500);
		cc.sacar(100);
		System.out.println(cc.getSaldo());
	}

}
