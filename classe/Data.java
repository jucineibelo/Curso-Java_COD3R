package classe;

public class Data {

	// parametros

	int dia;
	int mes;
	static int ano = 1990;

	// construtores

	public Data() {
		dia = 1;
		mes = 1;

	}

	public Data(int dia, int mesInicial) {
		this.dia = dia;
		mes = mesInicial;

	}

	// métodos

	String obterDataFormatada() {
		return String.format(dia + "/" + mes + "/" + ano); // metodos são utilizados com return
	}

	void imprimirDataFormatada() {
		System.out.println(dia + "/" + mes + "/" + ano); // funciona mas não é recomendada
	}
}
