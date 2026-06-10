package com.amanda.cursoJava.aula29;

public class main {
	public enum TiposStatus{
		INICIO, PROCESSANDO, FINALIZADO;
	}
	
	public static void main(String[] args) {
		
		// O método .values() nativo do Java retorna um array (vetor) 
        // contendo todas as constantes da Enum DiaSemana na ordem em que foram declaradas.
        // Como DiaSemana.java está no mesmo pacote, o Java o encontra automaticamente.
        DiaSemana[] dias = DiaSemana.values();
		for (DiaSemana dia : dias) {
			System.out.println(dia);
			System.out.println(dia.getValor());
		}
		
		// O método .valueOf(String) pega o texto puro "INICIO" enviado por parâmetro 
        // e o converte/procura o objeto real correspondente dentro da Enum TiposStatus.
        // Se o texto não existisse na Enum, o programa daria um erro (Exception).
		TiposStatus tipo = TiposStatus.valueOf("INICIO");
		System.out.println(tipo);
		
	}
}