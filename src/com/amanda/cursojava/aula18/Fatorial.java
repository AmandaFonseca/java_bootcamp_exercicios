package com.amanda.cursojava.aula18;


public class Fatorial {

	private static  int num;
 
	public static int fatorial(int num) {
		// Fatorial não existe para negativos
        if (num < 0) {
            throw new IllegalArgumentException("Não existe fatorial de número negativo.");
        }
        
		if (num == 0 || num == 1) {
			return 1;
		}
		
		int total = 1;
		
		for (int i = num; i > 1; i--) {
			total *= i; 
		}
		return total;
	}

}
