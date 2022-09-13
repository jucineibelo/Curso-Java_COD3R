package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>(); // <String> amarrou os tipos String se usar outro dado da errado
	
		//Set e Hash não é ordenado
		

		lista.add("Jucinei");
		lista.add("Camila");
		lista.add("Jorge");
		lista.add("Isabela");

		
		for (String candidato : lista) {
			System.out.println(candidato);
		}
		
		SortedSet<Integer> nums = new TreeSet<>();  // é ordenado 
		
		nums.add(66);
		nums.add(88);
		nums.add(69);
		nums.add(24);
		
		for (Integer number : nums) {
			System.out.println(number);
		}
		
	}

}
