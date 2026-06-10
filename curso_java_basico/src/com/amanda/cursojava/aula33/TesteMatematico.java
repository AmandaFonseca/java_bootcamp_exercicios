package com.amanda.cursoJava.aula33;

//IMPORTAÇÃO ESTÁTICA: Repare na ordem das palavras "import static"
//O asterisco (*) significa: traga TUDO que for estático de dentro 
//da classe Math
import static java.lang.Math.*;
public class TesteMatematico {

	public static void main(String[] args) {
		double raio = 5.0;
        
        // Sumiu o "Math."! Agora você usa direto:
        double area = PI * pow(raio, 2); 
        double raiz = sqrt(16);
        
        System.out.println("Área: " + area);
        System.out.println("Raiz: " + raiz);

	}

}
