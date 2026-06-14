package com.amanda.cursoJava.aula66;

public class  MinhaThreadSoma implements Runnable {
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	

	public MinhaThreadSoma(String nome, int[] nums) {
		super();
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}


	@Override
	public void run() {
        System.out.println(this.nome + " iniciada");
        
        // O método somaArray precisa ser sincronizado para evitar dados corrompidos!
        int soma = calc.somaArray(nums);
        
        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);
        System.out.println(this.nome + " terminada");		
	}

}
