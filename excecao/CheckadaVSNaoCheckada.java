package excecao;

public class CheckadaVSNaoCheckada {

	public static void main(String[] args) {

			geraErro1();


		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");
	}

	// Exceção Não checkada ou Não verificada
	static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	// Exceção checkada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");

	}

}
