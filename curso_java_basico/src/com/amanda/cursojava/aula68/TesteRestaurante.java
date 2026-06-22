package com.amanda.cursoJava.aula68;

public class TesteRestaurante {
	public static void main(String[] args) {
        Mesa mesa = new Mesa();

        // Thread do Cliente (Tenta comer)
        Thread threadCliente = new Thread(() -> {
            mesa.comer();
        });

        // Thread do Garçom (Cozinha e entrega)
        Thread threadGarcom = new Thread(() -> {
            mesa.entregarHamburguer();
        });

        // Iniciamos o cliente PRIMEIRO para ver ele esperando
        threadCliente.start();
        
        try { Thread.sleep(500); } catch (Exception e) {} // Pequena pausa só para garantir a ordem no console
        
        threadGarcom.start();
    }
    
}