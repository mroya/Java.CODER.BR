package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("o Hobbit");
		
		System.out.println(livros.peek());
		
				
	}
	

}
