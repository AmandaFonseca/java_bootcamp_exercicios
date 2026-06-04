package com.amanda.cursojava.aula19;

public class Parceiro {
	public void bisbilhotar() {
        Heroi heroi = new Heroi();
        
        System.out.println(heroi.nomePublico);    // ✅ SIM (public)
        System.out.println(heroi.poderProtected); // ✅ SIM (mesmo pacote)
        System.out.println(heroi.trajeDefault);   // ✅ SIM (default - mesmo pacote)
        
        // System.out.println(heroi.identidadeSecreta); 
        // ❌ ERRO DE COMPILAÇÃO! private é só da classe Heroi.
    }
}
