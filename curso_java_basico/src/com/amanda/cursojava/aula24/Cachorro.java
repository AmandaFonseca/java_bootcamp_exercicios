package com.amanda.cursoJava.aula24;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Au Au!";
    }

    @Override
    public String amamentar() {
        return "Cadela amamentando.";
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro sendo alimentado.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Levando cachorro ao veterinário.");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinário para o cachorro.");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro brincando.");
    }

    @Override
    public void levarPassear() {
        System.out.println("Levando cachorro para passear.");
    }
}
