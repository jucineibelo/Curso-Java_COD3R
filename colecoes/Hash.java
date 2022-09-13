package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Jucinei"));
		usuarios.add(new Usuario("Jorge"));
		usuarios.add(new Usuario("Jucimar"));
		usuarios.add(new Usuario("Marilena"));
		
		boolean resultado = usuarios.contains(new Usuario("Jucinei"));
		System.out.println(resultado);
	}

}
