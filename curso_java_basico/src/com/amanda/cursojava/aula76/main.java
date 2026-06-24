package com.amanda.cursoJava.aula76;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class main {

	public static <S> void main(String[] args) throws InterruptedException {
		/*
		 * Vector: Classe legada; raramente usada em novos projetos. ArrayList: Lista
		 * com acesso rápido por índice e muitas leituras. Duplicatas são permitidas Na
		 * maioria dos casos, ArrayList substitui o Vector.
		 */
		List<String> fruits = new ArrayList<>();
		/*
		 * ;add(): O método add(E element) insere o elemento no final da lista (na
		 * próxima posição livre do array interno) e, caso a capacidade atual do array
		 * tenha sido atingida, ele cria automaticamente um novo array maior, copia os
		 * elementos antigos e descarta o array anterior.
		 * 
		 * 
		 */
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		System.out.println("ArrayList: " + fruits);

		// LinkedList: Muitas inserções e remoções no início ou
		// meio da lista.
		LinkedList<String> fila = new LinkedList<>();
		fila.addFirst("João");
		fila.addLast("Pedro");
		System.out.println("LinkedList: " + fila);

		/*
		 * Stack: Classe legada para pilha (LIFO); prefira ArrayDeque.
		 * ArrayDeque:Implementar pilhas e filas de forma eficiente.
		 */
		ArrayDeque<String> pilha = new ArrayDeque<>();
		pilha.add("A");
		pilha.add("B");
		System.out.println("ArrayDeque: " + pilha.pop());

		/*
		 * PriorityQueue: Processar elementos por prioridade, não por ordem de inserção.
		 * Ordem Natural (Crescente): Por padrão, quando instanciada sem argumentos (new
		 * PriorityQueue<>()), a fila organiza elementos numéricos em ordem crescente
		 * (ordem natural). O menor número tem a maior prioridade de saída. ordem
		 * decrescente: PriorityQueue<Integer> fila = new
		 * PriorityQueue<>(java.util.Collections.reverseOrder());
		 */
		PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
		filaPrioridade.add(30);
		filaPrioridade.add(10);
		filaPrioridade.add(20);
		while (!filaPrioridade.isEmpty()) {
			// .poll(): Recupera e remove primeiro elemento desta lista.
			System.out.println("PriorityQueue: " + filaPrioridade.poll());
		}

		/*
		 * ArrayBlockingQueue: Fila com tamanho fixo para comunicação entre
		 * threads.Serve para gerenciar dados de forma segura entre múltiplas threads
		 * (concorrência). Ele implementa o modelo clássico de Produtor-Consumidor,
		 * bloqueando automaticamente a execução caso a fila esteja cheia ou vazia.Ordem
		 * FIFO: Os elementos são removidos exatamente na ordem em que foram inseridos.
		 * Obrigado a informar tamanho da lista.
		 */
		ArrayBlockingQueue<String> filaThread = new ArrayBlockingQueue<>(2);
		filaThread.put("Tarefa 1");
		filaThread.put("Tarefa 2");

		/*
		 * O método take() pertence às classes que implementam a interface
		 * BlockingQueue, como ArrayBlockingQueue e LinkedBlockingQueue. Ele remove e
		 * retorna o primeiro elemento da fila
		 */
		System.out.println("ArrayBlockingQueue: " + filaThread.take());
		System.out.println("ArrayBlockingQueue: " + filaThread.take());

		/*
		 * Exemplo de LinkedBlockingQueue: A principal diferença entre
		 * LinkedBlockingQueue e ArrayBlockingQueue está na forma como armazenam os
		 * elementos e no comportamento em relação à capacidade. No LinkedBlockingQueue:
		 * Como não foi informado um limite, ela pode crescer até acabar a memória
		 * disponível.
		 */
		LinkedBlockingQueue<String> filaLinkedBlockingQueue = new LinkedBlockingQueue<>();
		filaLinkedBlockingQueue.put("Mensagem 3");
		filaLinkedBlockingQueue.put("Mensagem 4");
		System.out.println("LinkedBlockingQueue: " + filaLinkedBlockingQueue.take()); // Mensagem 1
		System.out.println("LinkedBlockingQueue: " + filaLinkedBlockingQueue.take()); // Mensagem 2

		// HashSet: Armazenar elementos únicos sem se preocupar com a ordem.
		Set<String> uniqueFruits = new HashSet<>(fruits);
		System.out.println("HashSet: " + uniqueFruits);

		// LinkedHashSet: Elementos únicos mantendo a ordem de inserção.
		Set<String> uniqueFruitsInOrder = new LinkedHashSet<>(fruits);
		System.out.println("LinkedHashSet: " + uniqueFruitsInOrder); // Saída: [Apple, Banana] (Sem duplicatas!)

		/*
		 * TreeSet: Elementos únicos mantidos em ordem crescente ou por um comparador
		 */
		TreeSet<Integer> numeros = new TreeSet<>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);

		System.out.println("TreeSet" + numeros);

		// HashMap: Armazenar pares chave-valor com acesso rápido ou use
		// LinkedHashMap Mapa que preserva a ordem de inserção
		// (ou acesso).
		Map<String, Integer> inventory = new HashMap<>();
		inventory.put("Apple", 50);
		inventory.put("Banana", 20);
		inventory.put("Grape", 140);
		System.out.println("Map: " + inventory);
		System.out.println("Apple Stock: " + inventory.get("Apple")); // Saída: 50

		// Atualizando um valor
		// inventory.put("Uva", 32);

		// Obtendo um valor
		// System.out.println("fRUTA: " + inventory.get("uVA"));

		// Verificando se uma chave existe
		// System.out.println("Contém uVA? " + inventory.containsKey("uVA"));

		// Removendo um elemento
		// inventory.remove("uVA");

		// Iterando pelo Map
		for (Map.Entry<String, Integer> entrada : inventory.entrySet()) {
			System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " unidades.");
		}

		/* TreeMap: Mapa com chaves ordenadas. */
		Map<Integer, String> inventory2 = new TreeMap<>();
		inventory2.put(50, "Apple");
		inventory2.put(20, "Banana");
		System.out.println(inventory2);

		/*
		 * Hashtable: Classe legada sincronizada; geralmente substituída por
		 * ConcurrentHashMap. O ConcurrentHashMap é uma tabela de espalhamento (Map) do
		 * Java projetada para alta concorrência. Ela serve para armazenar dados no
		 * formato chave-valor e permite que múltiplas threads leiam e escrevam
		 * simultaneamente sem corromper os dados e sem travar o mapa inteiro.
		 */
		ConcurrentHashMap<String, Integer> estoque = new ConcurrentHashMap<>();

		// Inserção segura entre múltiplas threads
		estoque.put("Produto A", 10);

		// Atualização atômica (evita problemas de concorrência ao modificar valores)
		estoque.computeIfPresent("Produto A", (chave, valor) -> valor + 5);

		System.out.println("Quantidade atual: " + estoque.get("Produto A"));
	}
}