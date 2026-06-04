package com.amanda.cursojava.aula21;

/*O final na declaração da classe: significa que essa classe NÃO 
 * pode ser herdada (não pode usar extends Constantes).
 * 
/*static significa que o atributo pertence à classe, e não ao objeto.
 * Ou seja: Não precisa criar objeto (new); 
 * Existe uma única cópia na memória;
 * Pode acessar direto pelo nome da classe
 *  
 *  
 *O final na declaração do atributo é usado para garantir que o 
 *valor nunca vai ser alterado depois que ele foi atribuído. 
 * Ou seja, uma vez inicializada, a constante não muda.
*/    
    
/* Há boas práticas para nomear constantes: elas geralmente são 
 * escritas em letras maiúsculas, com palavras separadas por 
 * underscore (_).
 * Por exemplo:
 * URL_BLOG
 * URL_CURSO_COMPLETO
 * MAX_TENTATIVAS
 * */

public final class Constantes {

    public static final String URL_BLOG = "http://loiane.com";
    public static final String URL_CURSO_COMPLETO = "http://loiane.training";

}