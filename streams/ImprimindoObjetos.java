package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Juci", "Camila", "Gui", "Lucas");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		System.out.println("");

		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nUsando Iterator...");
		Iterator<String> goiabinha = aprovados.iterator();
		while (goiabinha.hasNext()) {
			System.out.println(goiabinha.next());
		}
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!!

	}

}
