package com.amanda.cursoJava.aula31;


public class main {

	public static void main(String[] args) {
		/*
		 * Tipo       Primitivo,Classe Wrapper
		 * int        Integer (o único que muda bastante o nome)
		 * double     Double
		 * float      Float
		 * char       Character (muda um pouco também)
		 * boolean    Boolean
		 * byte       Byte
		 * short      Short
		 * long      Long
		 * */
		
		 /*Autoboxing (Primitivo $\rightarrow$ Wrapper)
		 * É quando o Java coloca o valor primitivo dentro do 
		 * "envelope" automaticamente:Java* */
		int numPrimitivo = 10;
		Integer num = numPrimitivo;
		System.out.println(num instanceof Integer);
	
		/*Unboxing (Wrapper $\rightarrow$ Primitivo)
		 * É o contrário: quando o Java tira o valor de dentro do 
		 * envelope para usar como primitivo:*/
		 Integer num2 = 20;
		 int numPrimitivo2 = num2;
		 System.out.println(num2 instanceof Integer);
		
		 //Wrapper: Transforma um dado primitivo solto em um Objeto de 
		 //verdade (Ex: de int para Integer). Serve para usar em listas 
		 //(ArrayList), aceitar valores nulos (null) ou usar métodos prontos 
		 //como o Integer.parseInt(). NÃO É CASTING
		 String texto = "123";
		 int num3 = Integer.parseInt(texto);
		 System.out.println(num3);
		 
		 
	}
}