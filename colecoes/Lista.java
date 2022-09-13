package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("João");

		lista.add(new Usuario("Jucinei"));
		lista.add(new Usuario("Joaquin"));
		lista.add(new Usuario("Rogerio"));
		lista.add(new Usuario("Rogerio"));
		lista.add(new Usuario("Felisberto"));
		
		
		lista.remove(2);
		System.out.println(lista.contains(new Usuario("Jucinei"))); // contains : comparação  existe o nome "Jucinei" na array? retorna booleano
		
		System.out.println(lista.get(2));

		for (Usuario usa : lista) {
			System.out.println(usa.nome);
		}

	}

}
