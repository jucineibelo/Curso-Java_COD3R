package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import desafio_lambdas.Produto;

public class Consumidor {
	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 1212.34, 0.25);
		Produto p3 = new Produto("Carderno", 19.94, 0.03);
		Produto p4 = new Produto("Borracha", 7.34, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);	
		
	}

}