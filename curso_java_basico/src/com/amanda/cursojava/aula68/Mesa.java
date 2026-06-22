package com.amanda.cursoJava.aula68;

public class Mesa {
    private boolean hamburguerPronto = false;

    // Método que o Cliente chama
    public synchronized void comer() {
        // Enquanto não tiver hambúrguer, o cliente ESPERA
        while (!hamburguerPronto) {
            try {
                System.out.println("Cliente: Não tem comida na mesa. Vou esperar...");
                wait(); // O Cliente dorme E LIBERA a chave da mesa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Se o código chegou aqui, significa que ele foi acordado e o hambúrguer está pronto!
        System.out.println("Cliente: Que delícia! Comendo o hambúrguer... 🍔");
        hamburguerPronto = false; // O cliente comeu, a mesa esvaziou
    }

    // Método que o Garçom chama
    public synchronized void entregarHamburguer() {
        System.out.println("Garçom: Preparando o hambúrguer...");
        try {
            Thread.sleep(2000); // Simulando o tempo de cozinha (2 segundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hamburguerPronto = true;
        System.out.println("Garçom: Hambúrguer na mesa!");
        
        notify(); // ACORDA a thread que estava esperando (o Cliente)
    }
}