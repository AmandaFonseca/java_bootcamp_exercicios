package com.amanda.cursojava.aula18;


public class FatorialRecursividade {

	private  int num;
 
	public static int FatorialR(int num) {
		// break senão continua infinito
        if (num == 0) {
			return 1;
		}
		
		return num * FatorialR(num -1);
	}

}
