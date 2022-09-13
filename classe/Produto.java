package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 25;

	public Produto() {
		super();
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	double precoComDesconto() {
		return preco - (preco * (desconto / 100));

	}

}
