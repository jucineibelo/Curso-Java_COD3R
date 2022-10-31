package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(8.9);
		System.out.println(caixaA.abrir());
		
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(666);
		System.out.println(caixaB.abrir());

	}

}
