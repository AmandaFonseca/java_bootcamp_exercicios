package com.amanda.cursoJava.aula77;

//Importa a classe Optional, necessária para usarmos o contêiner 
//que evita NullPointerException
import java.util.Optional;

public class ContatoDAO {

	// Ele retorna um Optional que avisa quem chamou se o 
	//contato foi achado ou não
	public Optional<Contato>  buscarNome(String nome) {
		/*Para resolver isso, o Java criou o Optional, 
		 * que funciona como uma caixa transparente. 
		 * Ela pode estar cheia (conter um Contato) ou vazia.
		 * Ele analisa o que você colocou dentro dos parênteses:
		 * Se você passar um objeto válido, ele te dá uma caixa cheia.
		 * Se você passar null, ele te dá uma caixa vazia 
		 * (mas uma caixa segura, que não quebra o sistema)*/
		return Optional.ofNullable(null);
	}
	
	// Método estático que cria e retorna um objeto Contato com 
	//dados predefinidos
	public static Contato criarContatoPadrao() {
		System.out.println("Contato não encontrado!");
		System.out.println("Criando um contato padrão");
	// Instancia e retorna um novo objeto Contato passando o nome 
	//"Aisha" para o construtor
		return new Contato("Aisha");
	}
	
}
