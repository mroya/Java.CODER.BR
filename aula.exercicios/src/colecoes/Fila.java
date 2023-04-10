package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//.add() lançará uma exceção caso a fila esteja cheia.
		//.offer() retorna falso caso a fila esteja cheia.
		fila.add("Márcio");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // peek e element -> obter o proximo elementos
		System.out.println(fila.peek()); // da fila (sem remover)
		System.out.println(fila.element()); 
		// a diferença é o comportamento ocorre quando a fila está vazia!
		
		fila.size(); // verifica o tamanho
		fila.clear(); // verifica o tamanho
		fila.isEmpty(); // verifica se a fila esta vazia
		//System.out.println(fila.poll()); // retorna o 1º elemento da fila já removendo ele 
	}

}
