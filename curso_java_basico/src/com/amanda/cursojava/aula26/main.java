package com.amanda.cursoJava.aula26;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// 1. Criando os objetos reais
        Pato  patoDonald = new Pato("Donald");
        Peixe nemo = new Peixe("Nemo");
        Leao rei = new Leao("Mufasa");

        System.out.println("2. USANDO COMO ANIMAIS (Classe Abstrata)");
        // Uma lista do tipo da classe abstrata aceita qualquer filho dela
        List<Animal> meusAnimais = new ArrayList<>();
        meusAnimais.add(patoDonald);
        meusAnimais.add(nemo);
        meusAnimais.add(rei);
        
        for (Animal animal : meusAnimais) {
            animal.respirar(); // Método herdado com lógica pronta
            animal.emitirSom(); // Método abstrato que cada um resolveu do seu jeito
        }
 
        System.out.println("\n3. USANDO COMO NADADORES (Interface)");
        // Uma lista da interface só aceita objetos de classes que implementaram "Nadador"
        List<Nadador> clubeDosNadadores = new ArrayList<>();
        clubeDosNadadores.add(patoDonald);
        clubeDosNadadores.add(nemo);
        //clubeDosNadadores.add(rei); // Erro de compilação! Leão não implementa Nadador.
       
        for (Nadador nadador : clubeDosNadadores) {
            nadador.nadar(); // O sistema não sabe se é pato ou peixe, apenas que sabe nadar
        }

        System.out.println("\n 4. USANDO COMO VOADORES (Interface)");
        // Apenas quem assinou o contrato Voador entra aqui
        List<Voador> patotaDoAr = new ArrayList<>();
        patotaDoAr.add(patoDonald);
        // patotaDoAr.add(nemo); // Erro de compilação! Peixe não voa.

        for (Voador voador : patotaDoAr) {
            voador.voar();
        }                
	}

}
