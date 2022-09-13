package Polimorfismo;

public class JantarPrincipal {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(70);
		
		Arroz ingrediente1 = new Arroz(2.1);
		Feijao ingrediente2 = new Feijao(0.3);
		
		Comida ingradiente3 = new Feijao(0.9);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingradiente3);
		
		System.out.println(convidado.getPeso());

		
	
		
	}

}
