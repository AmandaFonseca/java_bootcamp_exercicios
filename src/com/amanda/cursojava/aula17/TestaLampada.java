package com.amanda.cursojava.aula17;


public class TestaLampada {
    public static void main(String[] args) {
    	Lampada lampada = new Lampada("LED", "110v", 60, "Branca", "Fluorescente", 12, new String[]{"E27"}, false, false);

    		System.out.println("Usando atributo estatico: " +lampada.getMarca());
    	    // Chama o Método 1 (sem parâmetros)
        lampada.ligar(); 

        // Chama o Método 2 (passando um número)
        lampada.ligar(80); 

        // Chama o Método 3 (passando um verdadeiro/falso)
        lampada.ligar(true);

        lampada.mostrarEstado();
        

        lampada.desligar();

        lampada.mostrarEstado();
    }

}
