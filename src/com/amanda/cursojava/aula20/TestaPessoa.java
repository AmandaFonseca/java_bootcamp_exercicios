package com.amanda.cursojava.aula20;


public class TestaPessoa {
	public static void main(String[] args) {
        Professor prof = new Professor("Marcos", 45, "123.456.789-90", "POO");
        Professor prof2 = new Professor("Angelica", 80, "188.456.789-90", "Artes");
        
        /* == :Compara referência de memória (se é o MESMO objeto).
         * */
        System.out.println(prof ==prof2);
        /*.equals()
		Compara conteúdo/valores do objeto.
		
		👉 pergunta: “Esses objetos têm os mesmos dados?”
		
		Mas atenção ⚠️
		Por padrão, o equals() da classe Object também compara memória.
		Por isso precisamos sobrescrever (override). se quisermos comparar somente
		Esses objetos têm os mesmos dados
         * */
        System.out.println(prof.equals(prof2));

	}
}
