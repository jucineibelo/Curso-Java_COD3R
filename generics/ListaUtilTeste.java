package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS","Python","Java","C#");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		String ultimaLinguagem = (String) (ListaUtil.getUltimo1(langs)); //SEM GENERICS NECESSITOU DE CASTING
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer)(ListaUtil.getUltimo1(nums));  //SEM GENERICS NECESSITOU DE CASTING
		System.out.println(ultimoNumero);
	
	
		String ultimaLinguagem2 =  (ListaUtil.getUltimo2(langs));  //COM GENERICS
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero2 = (ListaUtil.getUltimo2(nums)); //COM GENERICS
		System.out.println(ultimoNumero);
	
	
	}

}
