package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calcTeste = (x, y) -> {         //função lambda function
			return x + y;
		};
		
		System.out.println(calcTeste.executar(5,9));
		
		
		
		calcTeste = (x, y) -> x * y;
		
		System.out.println(calcTeste.executar(5,9));
		
		

	}

}
