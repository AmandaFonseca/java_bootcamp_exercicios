package com.amanda.cursoJava.aula71;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {

		String frase1 = "Eu amo Java";
        String frase2 = "Apostila de java";

        // Tradução dos números abaixo:
        // Olhe a 'frase1' a partir da posição 7 (onde começa o 'Java')
        // Olhe a 'frase2' a partir da posição 12 (onde começa o 'java')
        // Compare as próximas 4 letras.
        boolean igualAbaixo = frase1.regionMatches(7, frase2, 12, 4);
        
        /*
        System.out.println("Os pedaços são idênticos? " + igualAbaixo);
        System.out.println(frase1.indexOf("x"));
        System.out.println(frase1.indexOf("Eu"));
        System.out.println(frase1.lastIndexOf("Eu"));
        System.out.println(frase1.contains("Eu"));
        System.out.println(frase1.contains("Bolinha"));
        */
        
        System.out.println(frase1.substring(3,6));
		
        String info1 = "eu amo";
        String info2 = "chocolate";

        // O separador é o espaço " ". Os itens são info1 e info2.
        String alfabeto = String.join(" ", info1, info2);

        System.out.println(alfabeto); 
        // AGORA SIM ele imprime: eu amo chocolate
		
	}

}
