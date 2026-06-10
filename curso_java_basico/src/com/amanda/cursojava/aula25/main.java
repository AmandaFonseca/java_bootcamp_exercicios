package com.amanda.cursoJava.aula25;

public class main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(500);
		cc.sacar(100);
		System.out.println(cc.getSaldo());
	}

}
