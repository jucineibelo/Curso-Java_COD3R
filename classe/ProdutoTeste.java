package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2000;

		
		Produto p2 = new Produto();
		
		p2.nome = "Celular";
		p2.preco = 1500;

		
		Produto.desconto = 10;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		var MediadePrecos = (precoFinal1 + precoFinal2) / 2;
			
		System.out.println("Produto 1 "+ p1.nome+ "\nPreço normal R$: "+p1.preco+"\nDesconto: "+p1.desconto+"\nValor Final: "+ precoFinal1+"\n");
		System.out.println("Produto 2 "+ p2.nome+ "\nPreço normal R$: "+p2.preco+"\nDesconto: "+p2.desconto+"\nValor Final: "+ precoFinal2+"\n");
		
		System.out.println(MediadePrecos);
		
	}

}
