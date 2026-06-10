package com.amanda.cursoJava.aula22;

import java.util.Objects;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;
    private String cpf;

    public Professor(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcularSalarioLiquido() {
        return salario * 0.9;
    }
    /*Sobrescrita de equals e hashCode
     * sobrescreveu o equals, deve sobrescrever o hashCode.
     * 
     * Ao usar o cpf como critério, você garante que dois objetos 
     * Professor sejam considerados iguais se possuírem o mesmo 
     * documento, mesmo que estejam em locais diferentes da memória.
     * 
     * Isso é fundamental para o funcionamento correto de coleções 
     * como HashSet ou HashMap.
     * */

    // equals sobrescrito corretamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Professor)) return false;

        Professor outro = (Professor) obj;
        return Objects.equals(this.cpf, outro.cpf);
    }

    // obrigatório quando sobrescreve equals
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}