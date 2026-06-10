package com.amanda.cursoJava.aula32;

public class main {

	public static void main(String[] args) {
		double valorCompra = 100.0;
		// Simulando uma compra no Crédito
        TipoPagamento pgto1 = TipoPagamento.CARTAO_CREDITO;
        System.out.println("Taxa no Crédito: R$ " + pgto1.calcularTaxa(valorCompra)); 
        // Vai imprimir: 5.0

        // Simulando uma compra no Pix
        TipoPagamento pgto2 = TipoPagamento.PIX;
        System.out.println("Taxa no PIX: R$ " + pgto2.calcularTaxa(valorCompra)); 
        // Vai imprimir: 0.0
	}
}