package com.amanda.cursoJava.aula10;


import java.util.Scanner;

class variaveis {

	public static void main(String[] args) {
		int idade = 25;                  // Números inteiros
		float altura = 1.75f;            // Números fracionados (precisão simples, exige 'f')
		char inicial = 'J';              // Caractere único (aspas simples)
		boolean estaAtivo = true;  // Valores lógicos (true/false)
		
		// 1. Criar o objeto Scanner para ler o teclado (System.in)
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        
        // 2. Usar um método para ler o dado
        idade = leitor.nextInt(); 
        
         // "LIMPEZA": Lê o \n que sobrou e não guarda em lugar nenhum
        leitor.nextLine();
        System.out.println("Você tem " + idade + " anos.");
        
        /*
        nextLine()	Uma linha inteira (texto com espaços).
        next()	Apenas uma palavra (para no primeiro espaço).
        nextInt()	Um número inteiro.
        nextDouble()	Um número com vírgula (decimal).
        nextBoolean()	Valores verdadeiro ou falso (true/false).
        
        Print vs. Println
        A diferença é sutil, mas visualmente importante no console:
        System.out.print(): Imprime o conteúdo e mantém o cursor na mesma linha. 
        O próximo texto aparecerá colado ao anterior.
        System.out.println(): Imprime o conteúdo e pula para a próxima linha 
        (o "ln" vem de line).
        Atalho: Digite sysout e aperte Ctrl + Espaço.*/
        

        leitor.close(); //3. Boa prática: fechar o scanner
	}

}
