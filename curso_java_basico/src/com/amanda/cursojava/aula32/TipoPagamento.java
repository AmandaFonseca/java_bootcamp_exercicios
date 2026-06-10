package com.amanda.cursoJava.aula32;

public enum TipoPagamento {
	CARTAO_CREDITO {
		@Override
		public double calcularTaxa(double valor) {
			return valor * 0.05;
			
		}
	}, PIX {
		@Override
		public double calcularTaxa(double valor) {
			return valor * 2.05;
			
		}
	}, BOLETO {
		@Override
		public double calcularTaxa(double valor) {
			return valor * 0.00;
			
		}
	};
	
	public  abstract double calcularTaxa(double valor);
}
