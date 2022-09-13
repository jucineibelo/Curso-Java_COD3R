package classe;

public class PrincipalData {

	public static void main(String[] args) {

		Data data = new Data(); // objeto data

		data.dia = 17;
		data.mes = 8;
	

		Data mozao = new Data(); // objeto mozao

		mozao.dia = 15;
		mozao.mes = 11;

		Data unix = new Data(1, 1);

		Data teste = new Data();

		System.out.println(mozao.obterDataFormatada());
		System.out.println(data.obterDataFormatada());
		System.out.println(unix.obterDataFormatada());
		System.out.println(teste.obterDataFormatada());

	}

}
