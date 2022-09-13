package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner novo = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int quantidade = 0;

		while (nota != -1) {
			System.out.println("Insira uma nota: ");
			nota = novo.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total = total + nota;
				quantidade++;
			} else if (nota != -1) {
			}
		}

		double media = total / quantidade;

		System.out.println(media);

	}

}
