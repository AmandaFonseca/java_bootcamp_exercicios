package com.amanda.cursoJava.aula67;

public class Main {

    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("thread#1", 600);        
        MinhaThread thread2 = new MinhaThread("thread#9", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        // 🌟 CONFIGURANDO AS PRIORIDADES ANTES DO START
        // As prioridades vão de 1 (mínima) a 10 (máxima)
        t1.setPriority(Thread.MAX_PRIORITY); // Prioridade 10 (Máxima)
        t2.setPriority(Thread.MIN_PRIORITY); // Prioridade 1 (Mínima)
        
        // Também dá para passar o número direto:
        // t1.setPriority(8);

        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("As threads foram terminadas e o programa principal continuou.");
    }
}