package com.amanda.cursoJava.aula65;

public class Main {

	public static void main(String[] args) {
		// 1. Instancia a sua thread passando o nome no construtor
		MinhaThread thread1 = new MinhaThread("thread#1",600);		
		MinhaThread thread2 = new MinhaThread("thread#2",900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
     // 2. Inicializa a thread (isso faz o Java executar o método run() em paralelo)
        t1.start();
        t2.start();
        
        try {
            // 3. O método .join() faz com que a execução principal (main) 
            // espere essa thread terminar antes de continuar o código abaixo
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("As threads foram terminadas e o programa principal continuou.");
		
		
	}

}
