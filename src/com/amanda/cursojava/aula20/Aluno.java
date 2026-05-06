package com.amanda.cursojava.aula20;


public class Aluno extends Pessoa{
	private String matricula;
	private String curso;
	private double notas [];
	
	public Aluno(String nome, int idade, String cpf, String matricula) {
		super(nome, idade, cpf);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double [] getNotas() {
		return notas;
	}
	
	public void setNotas(double [] notas) {
		this.notas = notas;
	}
	
    public double calcularMedia(double [] notas) {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }
	
    public void verificarAcesso() {
    		super.cpf = "38752824880";
	}

	@Override
	public String obterNome() {
		// TODO Auto-generated method stub
		return "Joaozinho";
	}
}