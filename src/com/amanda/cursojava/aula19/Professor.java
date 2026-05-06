package com.amanda.cursojava.aula19;

public class Professor extends Pessoa {
	   private String departamento;
	   private String nomeCurso;
	   private double salario;
	   
	   public Professor(String nome, int idade, String endereco, String telefone, 
			   String cpf, String departamento,String nomeCurso, double salario) {
		
		super(nome, idade, cpf, endereco, telefone);
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
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
		   //Aqui já não dá erro pq na classe pai esse atributo é publico.
		   super.visibilidadePublica = "pode";	 
		   
	    	//conseguimos acesse sem problemas esse atributo pq ele é protected, 
	    	//protected: Atributos e métodos acessíveis na própria classe, no pacote, 
	    	//e em subclasses, mesmo que fora do pacote.
	        
	    	super.cpf = "38752824880";
	   }
	   
	   public void verificarNome() {
//private: Atributos/métodos acessíveis apenas dentro da própria classe pai, por isso dá erro.
		   //super.nome = "Aisha";
		   // nesse caso para acessa valor atributo private na classe pai
		   //criamos metodos public.
		   super.getNome();
	   }
}
