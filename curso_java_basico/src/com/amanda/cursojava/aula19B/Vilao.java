package com.amanda.cursoJava.aula19B;

import com.amanda.cursoJava.aula19.Heroi;

public class Vilao {
	public void atacar() {
        Heroi heroi = new Heroi();
        
        System.out.println(heroi.nomePublico); // ✅ SIM (public deixa qualquer um ver)
        
        // ❌ ERRO para todos os outros abaixo:
        // System.out.println(heroi.poderProtected);  // Não é do pacote e nem filho
        // System.out.println(heroi.trajeDefault);    // Não é do mesmo pacote
        // System.out.println(heroi.identidadeSecreta);// longe disso!
    }
}
