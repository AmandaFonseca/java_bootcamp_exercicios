package com.amanda.cursojava.aula19.teste;

import com.amanda.cursojava.aula19.Pessoa;

public class Aluno extends Pessoa{

	private String matricula;
	private String curso;
	private double notas [];
	
	
	
	public Aluno(String nome, int idade, String cpf, String endereco, 
			String telefone, String matricula, String curso, double[] notas) {
		super(nome, idade, cpf, endereco, telefone);
		
		this.matricula = matricula;
		this.curso = curso;
		this.notas = notas;
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
    	//modificador Atributos e métodos acessíveis somente dentro do mesmo pacote.
    	//mesmo sendo uma subclasse não é o mesmo pacote,por isso da erro
//		   super.visibilidade = "pode";
    	//Aqui já não dá erro pq na classe pai esse atributo é publico.
    	super.visibilidadePublica = "pode";
    	
    	//conseguimos acesse sem problemas esse atributo pq ele é protected, 
    	//protected: Atributos e métodos acessíveis na própria classe, no pacote, 
    	//e em subclasses, mesmo que fora do pacote.
        
    	super.cpf = "38752824880";
    	
	}
}