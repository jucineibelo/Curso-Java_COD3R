package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {

		
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add("x"); // char -> Character

		conjunto.add(1.2);
		conjunto.add(1.2); // NÃO ACEITA VALOR REPETIDO LÁ TAMANHO conjunto.size O TAMANHO AINDA É 5
		conjunto.add(1.2);
		conjunto.add(1.2);

		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println(conjunto);
		System.out.println(conjunto.remove(1.2));
		System.out.println(conjunto.remove(true));
		System.out.println(conjunto.remove(1));

		System.out.println(conjunto.size());
		System.out.println(conjunto);

		System.out.println(conjunto.contains("teste")); // se contem a triste "teste" na coleção, retorna booleano

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		conjunto.addAll(nums);

		System.out.println(conjunto);

	}

}
