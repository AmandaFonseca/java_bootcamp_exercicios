package com.amanda.cursojava.aula20;

public class Professor extends Pessoa {
	   private String departamento;
	   private String nomeCurso;
	   private double salario;
	   
	   public Professor(String nome, int idade, String cpf, String departamento) {
		   super(nome, idade, cpf);
		   this.departamento = departamento;
	   }
	   
	   public String getDepartamento() {
		   return departamento;
	   }
	   public void setDepartamento(String departamento) {
		   this.departamento = departamento;
	   }
	   public String getNomeCurso() {
		   return nomeCurso;
	   }
	   public void setNomeCurso(String nomeCurso) {
		   this.nomeCurso = nomeCurso;
	   }
	   public double getSalario() {
		   return salario;
	   }
	   public void setSalario(double salario) {
		   this.salario = salario;
	   }
	   
	   public double calcularSalarioLiquido() {
	       return salario * 0.9;
	   }
	   
	   public void verificarVisibilidade() {
		  super.visibilidadePublica = "pode";	 
	      super.cpf = "38752824880";
	   }
	   
	   public void verificarNome() {
		   super.getNome();
	   }

	   @Override
	   public String obterNome() {
		// TODO Auto-generated method stub
		return "Pasquale";
	   }
}
