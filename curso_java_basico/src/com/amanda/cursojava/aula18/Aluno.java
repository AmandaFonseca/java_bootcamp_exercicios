package com.amanda.cursojava.aula18;


public class Aluno extends Pessoa {

	private String nomecurso;
	private double[] notas;
	
	public Aluno(String nome, String telefone, double[] notas) {
		// O "super" DEVE ser a primeira linha do construtor!
		super(nome, telefone);
		// Inicializa o que é exclusivo do Aluno
		this.notas = notas;
	}

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