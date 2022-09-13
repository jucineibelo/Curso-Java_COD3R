package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaLIFO {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();

		livros.add("O pequeno principe");
		livros.add("Dom Quixote");
		livros.push("O hobbit");
		livros.push("Super Homem");
		
		for ( String i : livros) {
			System.out.println(i);
		}

		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.pop()); // remover ultimo elemento
		System.out.println(livros.poll()); // remover ultimo elemento
		System.out.println(livros.remove()); // remover ultimo elemento
	}
	
	

}
