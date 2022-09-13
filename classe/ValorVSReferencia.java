package classe;

public class ValorVSReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a;    //ATRIBUIÇÃO POR VALOR (TIPO PRIMITIVO)
		
		a++;
		b--;
		System.out.println(a + "  "+b);
		
		Data d1 = new Data (1,1);
		Data d2 = d1;  //ATRIBUIÇÃO POR REFERÊNCIA (OBJETO)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2000;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
				
	}

}
