package com.amanda.cursojava.aula24;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);
    }

    public abstract String amamentar();
}