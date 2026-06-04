package com.amanda.cursojava.aula20;


public class Professor extends Pessoa {
	private String nomeCurso;
	private double[] notas;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String obterEtiquetaEndereco() {
		String s  = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}

	
}