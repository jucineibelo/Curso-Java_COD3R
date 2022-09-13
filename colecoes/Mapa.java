package colecoes;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(666, "Jucinei");
		usuarios.put(777, "Juci");
		usuarios.put(69, "Jucilei");

		for (String ju : usuarios.values()) {
			System.out.println(ju);
		}
		
		for (int nums : usuarios.keySet()) {
			System.out.println(nums);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey()+ " ==> ");
			System.out.println(registro.getValue());
			
		}

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.keySet());

		System.out.println(usuarios.containsKey(666));
		System.out.println(usuarios.containsValue("Jucinei"));
	}

}
