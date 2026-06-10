package com.amanda.cursoJava.aula18;


public class Professor extends Pessoa {

	public Professor(String nome, String telefone) {
		super(nome, telefone);
		// TODO Auto-generated constructor stub
	}
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
	
	

	
}