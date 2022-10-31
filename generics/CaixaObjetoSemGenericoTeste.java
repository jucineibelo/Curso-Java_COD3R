package generics;

public class CaixaObjetoSemGenericoTeste {
	public static void main(String[] args) {
		
		CaixaObjetoSemGenerics caixaA = new CaixaObjetoSemGenerics();
		caixaA.guardar(5.8);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjetoSemGenerics caixaB = new CaixaObjetoSemGenerics();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
