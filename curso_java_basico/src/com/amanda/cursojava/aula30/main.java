package com.amanda.cursoJava.aula30;

public class main {
	public enum TiposStatus{
		INICIO, PROCESSANDO, FINALIZADO;
	}
	
	public static TiposStatus usandoEnum(String statusAtual) {
		TiposStatus tiposStatus;
		
		switch (statusAtual) {
		case "inicio":
			tiposStatus = TiposStatus.INICIO;
			break;
		case "processando":
			tiposStatus = TiposStatus.PROCESSANDO;
			break;
		default:
			tiposStatus = TiposStatus.FINALIZADO;
			break;
		}
		return tiposStatus;
	}
	
	
	public static void main(String[] args) {
		TiposStatus tiposStatus = usandoEnum("fianlizado");
		System.out.println("O status atual é "+ tiposStatus);
	}
}