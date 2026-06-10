package com.amanda.cursoJava.aula09;

//Classes de apoio para o exemplo de objeto funcionar no mesmo arquivo:
class Animal {
	void respirar() {
	   System.out.println("Respirando...");
	}
}

class Cachorro extends Animal {
	void latir() {
	   System.out.println("Au Au...!");
	}
}

public class main {

public static void main(String[] args) {
        
        // 1. CASTING PRIMITIVO (Conversão de Números)        
        double preco = 9.99;
        
        // O Java não deixa fazer "int apenasPreco = preco;" porque vai perder informação.
        // Usamos o casting (int) para forçar o Java a aceitar. Ele vai "cortar" as frações.
        int precoInteiro = (int) preco; 
        
        System.out.println("--- Casting Primitivo ---");
        System.out.println("Preço original (double): " + preco);        // 9.99
        System.out.println("Preço após casting (int): " + precoInteiro); // 9 (perdeu o .99)
        
        // 2. CASTING DE OBJETOS (Downcasting)
        // Criando um cachorro, mas guardando ele em uma variável genérica do tipo Animal
        Animal meuAnimal = new Cachorro(); 
        
        // Se eu tentar fazer "meuAnimal.latir();", o Java não deixa, 
        // porque a variável é do tipo "Animal" e animais genéricos não latem.
        
        // Usamos o casting de objeto (Cachorro) para dizer ao Java:
        // "Eu garanto que esse animal é um Cachorro, me deixa acessar os métodos dele!"
        Cachorro meuCachorro = (Cachorro) meuAnimal;
        
        System.out.println("\n--- Casting de Objeto ---");
        meuCachorro.latir(); // Agora funciona! Vai imprimir: "Au Au!"
    }

}
