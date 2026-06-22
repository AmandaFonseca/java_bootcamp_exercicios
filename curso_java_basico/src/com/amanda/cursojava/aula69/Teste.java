package com.amanda.cursoJava.aula69;

public class Teste {
    public static void main(String[] args) {
        
        MinhaThread t1 = new MinhaThread("#1");

        try {
            Thread.sleep(1000); // Deixa rodar um pouco
            
            t1.pausar(); // Pausando via flag + wait
            Thread.sleep(2000); // Fica pausada por 2 segundos
            
            t1.retomar(); // Retomando via flag + notify
            Thread.sleep(1000); // Deixa rodar mais um pouco
            
            t1.parar(); // Parando a execução com segurança via flag
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}