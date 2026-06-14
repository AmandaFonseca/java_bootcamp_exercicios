package com.amanda.cursoJava.aula66;

public class Calculadora {
    
    private int soma;
    
    /*O que esse synchronized garante na sua lógica?
Sem ele, como a variável private int soma pertence ao escopo da 
classe (é global no objeto Calculadora), a Thread#1 e a Thread#2 
iriam redefinir soma = 0 e incrementar os valores ao mesmo tempo. 
Uma destruiria o cálculo da outra.
     * */
    public synchronized int somaArray(int[] array){
        
        soma = 0;
        
        for (int i=0; i<array.length; i++) {
            
            soma += array[i];
            
            System.out.println("Executando a soma " + Thread.currentThread().getName());
            
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}       
         }
        
        return soma;
    }
}