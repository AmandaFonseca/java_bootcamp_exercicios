package com.amanda.cursojava.aula28;


public class Aluno extends Pessoa {

	private String nomecurso;
	private double[] notas;

	public double calcularMedia(){
		return 0;
	}

	public boolean verificarAprovado(){
		return true;
	}
	public String getNomecurso() {
		return nomecurso;
	}

	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}