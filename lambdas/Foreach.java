package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional...");

		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);

		System.out.println(" ");

///////////////////////////////////////////////////////////////////////////////////////////////		

		List<String> juci = new ArrayList<>();

		juci.add("Juci");
		juci.add("Jucimar");
		juci.add("Jorge");
		juci.add("José");
		juci.add("Marilena");

		System.out.println("Método Tradicional 1");
		for (String goiabinha : juci) {
			System.out.println(goiabinha);
		}
		System.out.println("");

		System.out.println("Metodo lambda 1");
		juci.forEach(goiabinha -> System.out.println(goiabinha));

		System.out.println("\nMethod Reference 1...");
		juci.forEach(System.out::println);

		////////////////////////////////////////////////////		
		
		System.out.println("");

		System.out.println("Metodo lambda 2");
		juci.forEach(nome -> meuImprimir(nome));

		System.out.println("\nMethod Reference 2...");
		juci.forEach(Foreach::meuImprimir);
		
	

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é: " + nome);
	}
}
