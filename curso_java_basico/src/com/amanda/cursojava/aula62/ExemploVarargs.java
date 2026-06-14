package com.amanda.cursoJava.aula62;

public class ExemploVarargs {

    // Método tradicional usando array de tipos primitivos
    static int soma(int[] vetor) {
        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }

    // Método moderno usando Varargs (ajustado para int... por boa prática)
    static int soma11(int... nomeVetor) {
        int total = 0;
        for (int i = 0; i < nomeVetor.length; i++) {
            total += nomeVetor[i];
        }
        return total;
    }

    // O único e exclusivo método main da classe
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        
        System.out.println(soma(vetor));
        System.out.println(soma11(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
