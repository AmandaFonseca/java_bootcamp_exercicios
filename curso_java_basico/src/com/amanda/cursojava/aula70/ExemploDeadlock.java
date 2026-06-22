package com.amanda.cursoJava.aula70;
public class ExemploDeadlock {

    public static void main(String[] args) {
        final String LIVRO = "Livro de Java";
        final String CANETA = "Caneta Azul";

        // Thread 1: Amanda pega o Livro e quer a Caneta
        Thread tAmanda = new Thread(() -> {
            synchronized (LIVRO) {
                System.out.println("Amanda: Peguei o " + LIVRO + " e estou esperando a caneta...");
                
                try { Thread.sleep(100); } catch (Exception e) {} // Simula um processamento

                synchronized (CANETA) {
                    System.out.println("Amanda: Consegui os dois! Vou estudar.");
                }
            }
        });

        // Thread 2: Loiane pega a Caneta e quer o Livro
        Thread tLoiane = new Thread(() -> {
            synchronized (CANETA) {
                System.out.println("Loiane: Peguei a " + CANETA + " e estou esperando o livro...");
                
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (LIVRO) {
                    System.out.println("Loiane: Consegui os dois! Vou estudar.");
                }
            }
        });

        tAmanda.start();
        tLoiane.start();
    }
    
    /*O programa vai rodar, imprimir as duas linhas abaixo e ficará travado infinitamente:

Plaintext
Amanda: Peguei o Livro de Java e estou esperando a caneta...
Loiane: Peguei a Caneta Azul e estou esperando o livro...
(E o programa nunca termina...)
     * **/
    
    
}