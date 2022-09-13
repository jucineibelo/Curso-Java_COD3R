package composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();

		compra1.cliente = "Jucinei Belo";
		compra1.adicionarItem(new Item("Caneta", 20, 7.50));
		compra1.adicionarItem(new Item("Caderno", 10, 11.90));
		compra1.adicionarItem(new Item("Cola", 1, 7.80));
		
		System.out.println(compra1.obterValorTotal());
		
		

	}
	


}
