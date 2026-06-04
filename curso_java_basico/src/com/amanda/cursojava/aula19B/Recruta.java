package com.amanda.cursojava.aula19B;

// Precisa importar porque está em outro pacote
import com.amanda.cursojava.aula19.Heroi;

public class Recruta extends Heroi {
	public void treinar() {
		// ✅ SIM (public)
		System.out.println(this.nomePublico);
		
		// ✅ SIM! O protected liberou por ser SUBCLASSE!
		System.out.println(this.poderProtected);
        
        // System.out.println(this.trajeDefault);   
        // ❌ ERRO! default não deixa entrar porque mudou de pacote.
        
        // System.out.println(this.identidadeSecreta); 
        // ❌ ERRO! private continua trancado a sete chaves.
	}

}
