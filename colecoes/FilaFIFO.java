package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaFIFO {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!

		fila.add("Joana");
		fila.offer("João"); // La
		fila.offer("Jhones");
		fila.offer("Jair");
		fila.offer("Jorge");
		fila.offer("Joaquim");

		System.out.println(fila.peek());
		System.out.println(fila.element());

		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila);

		fila.clear();
		System.out.println(fila.isEmpty());
		
		fila.offer("Jair");
		fila.offer("Jair");
		
		for (String shit  : fila ) {
			System.out.println(shit);
		}
	}

}
