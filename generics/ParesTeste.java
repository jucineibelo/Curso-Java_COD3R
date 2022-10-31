package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Juci");
		resultadoConcurso.adicionar(2, "Camila");
		resultadoConcurso.adicionar(3, "José");
		resultadoConcurso.adicionar(4, "Marilena");
		resultadoConcurso.adicionar(2, "Daniela");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(4));


	}

}
