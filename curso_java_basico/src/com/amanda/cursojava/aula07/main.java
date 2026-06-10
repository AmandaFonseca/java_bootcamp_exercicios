package com.amanda.cursoJava.aula07;


public class main {

	public static void main(String[] args) {
        // final int x = 10;
        // System.err.println(x);
        /*
         * "message": "cannot assign a value to final variable x",
         */
        // x = 15;
        // System.err.println(x);
        String variavelTxt = "Teste";
        int variavelInt = 1;
        System.err.println(variavelTxt + "" + variavelInt);

        // Automatic castingExercicioMath
        // double y = x;
        // System.err.println(y);

        // int a = 1, b = 5, c = 10;
        // System.out.println(a + b + c);

        // Automatic casting: int to double
        // double d = c;
        // System.out.println(d);

        // Explicit casting: double to int
        // double valorCompra = 20.00;
        // int valorCompraInt = (int) valorCompra;
        // System.out.println(valorCompraInt);
        int num = 5;
        num++;
        // System.out.println(num);
        // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println(txt.length());

        // String aux = "AISHA";
        // System.out.println(aux.toLowerCase());
        // System.out.println(aux.toUpperCase());

        // concatenação de strings
        // String frase = "concatenação de strings";
        // System.out.println(frase.indexOf("de"));

        System.out.println(Math.max(5, 2));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int x = 10;
        int y = 9;
        System.err.println(y > x);

	}

}
