package com.amanda.cursojava.aula22;

public class TesteProfessor {

    public static void main(String[] args) {
        
        // 1. Criando um professor
        Professor prof1 = new Professor("Amanda Silva", 32, "123.456.789-00");
        prof1.setDepartamento("Tecnologia");
        prof1.setNomeCurso("Java Completo");
        prof1.setSalario(5000.00);

        // 2. Criando outro professor com o MESMO CPF para testar o seu método equals
        Professor prof2 = new Professor("Amanda Oliveira", 32, "123.456.789-00");
        prof2.setSalario(6000.00);

        // 3. Criando um professor com CPF diferente
        Professor prof3 = new Professor("Ricardo Santos", 40, "999.888.777-11");

        // --- EXIBINDO OS RESULTADOS ---

        System.out.println("=== Dados do Professor 1 ===");
        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Curso: " + prof1.getNomeCurso());
        System.out.println("Salário Bruto: R$ " + prof1.getSalario());
        System.out.println("Salário Líquido (com 10% desc): R$ " + prof1.calcularSalarioLiquido());

        System.out.println("\n=== Teste de Igualdade (Baseado no CPF) ===");
        
        // Testa se prof1 é igual a prof2 (Devem ser iguais pois têm o mesmo CPF)
        if (prof1.equals(prof2)) {
            System.out.println("Resultado: Prof1 e Prof2 são o mesmo professor (CPF idêntico).");
        } else {
            System.out.println("Resultado: Professores diferentes.");
        }

        // Testa se prof1 é igual a prof3 (Devem ser diferentes)
        System.out.println("Prof1 é igual a Prof3? " + (prof1.equals(prof3) ? "Sim" : "Não"));

        System.out.println("\n=== Teste de HashCode ===");
        System.out.println("HashCode Prof1: " + prof1.hashCode());
        System.out.println("HashCode Prof2: " + prof2.hashCode());
        System.out.println("Os HashCodes devem ser iguais se os CPFs forem iguais.");
    }
}