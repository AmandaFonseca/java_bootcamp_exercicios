package com.amanda.cursojava.aula27;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// 1. O objeto nasce como Aluno, mas é guardado como Pessoa 
		//(Upcasting)
		Pessoa pe = new Aluno(); 
		pe.setNome("Lua");
		
		
		//System.out.println(pessoa.calcularMedia());
		// ❌ ERRO DE COMPILAÇÃO! agr só pode acessar atributos e 
		// class de pessoas. 
		//Upcasting: Aluno ➡️ Pessoa (Seguro / Automático).
		System.out.println(pe.getNome());
		
		
		/* É uma forma de tratar um objeto de uma subclasse como um 
		 * objeto da sua superclasse. Essa conversão é feita 
		 * implicitamente pela Quando se realiza um upcasting, o objeto 
		 * da **subclasse** perde seus atributos e métodos específicos 
		 * que não estão presentes na superclasse. O objeto resultante 
		 * só pode acessar os métodos e atributos definidos na 
		 * superclasse.
		 * A conversão ascendente (upcasting) é útil quando você deseja 
		 * usar um único tipo de referência para se referir a objetos 
		 * de diferentes subclasses. Isso permite escrever um código 
		 * mais genérico que pode lidar com diferentes tipos de objetos 
		 * sem precisar escrever código separado para cada tipo
		 * */

		
		/* Downcasting é o oposto de upcasting. É o processo de 
		 * converter um tipo de referência da superclasse em um objeto 
		 * da sua subclasse. Em outras palavras, é uma maneira de 
		 * tratar um objeto da superclasse como um obj. da sua 
		 * subclasse. Essa conversão é feita explicitamente pelo 
		 * programador usando o operador de conversão (cast). Quando a 
		 * conversão para um tipo inferior(downcasting) é realizada, se 
		 * ela se refere a um objeto da subclasse. Se sim, a referência 
		 * é convertida para o tipo da subclasse. Caso contrário, uma 
		 * exceção ClassCastException é lançada em tempo de execução.**/
		


		// 2. Downcasting manual: Você avisa o Java que 'pe' é 
		//um Aluno
		Aluno aluno2 = (Aluno) pe; 

		// 3. Agora o acesso aos métodos específicos de Aluno 
		//está liberado
		System.out.println(aluno2.calcularMedia()); 
		
	}
}