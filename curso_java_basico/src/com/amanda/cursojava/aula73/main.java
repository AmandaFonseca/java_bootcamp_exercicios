package com.amanda.cursoJava.aula73;


public class main {

    public static void main(String[] args) {

        // =====================================================================
        // 1. O JEITO RUIM (Concatenação com + em loops)
        // =====================================================================
        String textoString = "";
        // A cada volta do loop, um objeto String novo é criado na memória. Lento!
        for (int i = 0; i < 5; i++) {
            textoString += i + " "; 
        }
        System.out.println("Com String normal: " + textoString);
        System.out.println();


        // =====================================================================
        // 2. O JEITO CERTO E RÁPIDO: StringBuilder
        // =====================================================================
        System.out.println("--- Usando StringBuilder ---");
        
        StringBuilder sb = new StringBuilder();
        
        // Em vez de '+', usamos o método .append() para ir colando os textos
        sb.append("Eu ");
        sb.append("amo ");
        sb.append("Java!");
        
        System.out.println("Texto colado: " + sb); // Imprime: Eu amo Java!
        
        // Ele possui métodos incríveis de manipulação:
        sb.reverse(); // Inverte o texto inteiro de trás para frente!
        System.out.println("Invertido: " + sb);
        
        sb.reverse(); // Desinverte para os próximos testes
        
        // Deletando um pedaço (deleta do índice 3 até o 7)
        sb.delete(3, 7); 
        System.out.println("Após deletar um pedaço: " + sb); // Retorna: Eu Java!
        System.out.println();


        // =====================================================================
        // 3. StringBuffer (Mesma coisa, mas segura para Threads)
        // =====================================================================
        System.out.println("--- Usando StringBuffer ---");
        
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("Mesmos ").append("métodos ").append("aqui."); // Permite encadear métodos
        
        System.out.println("Resultado Buffer: " + sBuffer);
        
        // No final, se você precisar transformar o StringBuilder/Buffer de volta 
        // em uma String normal para passar para um método, use o .toString()
        String textoFinal = sBuffer.toString();
    }
}