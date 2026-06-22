package com.amanda.cursoJava.aula72;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		/**0 (O índice inicial / offset): Diz ao Java para começar 
		 * a copiar a partir da posição 0 do array (que corresponde 
		 * ao caractere 'A').
		 * 3 (A quantidade / count): Diz ao Java quantos caracteres 
		 * copiar a partir do índice inicial. Nesse caso, ele copia 
		 * exatamente 3 caracteres ('A', 'B' e 'C').
		 * */
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3);
		System.out.println(abc);
		
		String um = String.valueOf(1);
		System.out.println(um);
		
		// Nossa String base para os testes
        String texto = "Curso Java";
        System.out.println("Texto original: \"" + texto + "\"\n");

        // =====================================================================
        // 1. MÉTODO: charAt(index)
        // Objetivo: Extrai um único caractere em uma posição específica (0 a tamanho-1).
        // =====================================================================
        char primeiraLetra = texto.charAt(0); // Pega o caractere na posição 0 ('C')
        char quintaLetra = texto.charAt(6);   // Pega o caractere na posição 6 ('J')
        
        System.out.println("--- 1. Testando charAt ---");
        System.out.println("Caractere na posição 0: " + primeiraLetra);
        System.out.println("Caractere na posição 6: " + quintaLetra);
        System.out.println();


        // =====================================================================
        // 2. MÉTODO: toCharArray()
        // Objetivo: Transforma a String inteira em um array real de caracteres (char[]).
        // Muito útil para fazer loops ou quando precisamos modificar posições.
        // =====================================================================
        char[] vetorCaracteres = texto.toCharArray();
        
        System.out.println("--- 2. Testando toCharArray ---");
        System.out.println("Vetor convertido: " + Arrays.toString(vetorCaracteres));
        // Fazendo um loop para imprimir letra por letra do array gerado
        System.out.print("Loop no vetor: ");
        for (char c : vetorCaracteres) {
            System.out.print(c + " ");
        }
        System.out.println("\n");


        // =====================================================================
        // 3. MÉTODO: getChars(srcBegin, srcEnd, dst, dstBegin)
        // Objetivo: Copia um PEDAÇO da String para dentro de um array que já existe.
        // Parâmetros:
        //   - 6 (srcBegin): Onde começa a copiar na String (Inclusivo -> 'J')
        //   - 10 (srcEnd): Onde termina na String (Exclusivo -> para antes, no 'a')
        //   - destino (dst): O array que vai receber os dados
        //   - 0 (dstBegin): A partir de qual índice do array de destino vamos colar
        // =====================================================================
        System.out.println("--- 3. Testando getChars ---");
        char[] destino = new char[4]; // Criamos um array vazio de tamanho 4
        
        // Extrai a palavra "Java" (índices 6, 7, 8 e 9)
        texto.getChars(6, 10, destino, 0); 
        
        System.out.println("Pedaço extraído para o array de destino: " + Arrays.toString(destino));
        System.out.println();


        // =====================================================================
        // 4. MÉTODO: getBytes()
        // Objetivo: Converte os caracteres em seus valores numéricos correspondentes
        // na tabela de codificação do sistema (geralmente UTF-8 / ASCII).
        // Muito usado para salvar arquivos binários ou tráfego de dados na rede.
        // =====================================================================
        System.out.println("--- 4. Testando getBytes ---");
        byte[] vetorBytes = texto.getBytes();
        
        // Imprime os códigos numéricos de cada letra (Ex: 'C' é 67, 'u' é 117...)
        System.out.println("Vetor de bytes (valores ASCII): " + Arrays.toString(vetorBytes));
		
		
		
		
		
		
	}

}
