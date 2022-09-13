package controle;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Insira uma nota: ");
		double nota = novo.nextDouble();
		
		if (nota < 0 || nota >10 ) {
			System.out.println("Nota Inválida!");
		} else if (nota > 0 && nota < 5) {
			System.out.println("Você está Reprovado!");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Você está em recuperação");
		} else {
			System.out.println("Aprovado \nParabéns!");
		}
		
	}

}
