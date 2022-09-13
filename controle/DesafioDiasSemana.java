package controle;

import java.util.Scanner;

public class DesafioDiasSemana {
	public static void main(String[] args) {
		Scanner dia = new Scanner(System.in);

		// Domingo 1
		// Segunda 2
		// Terça 3
		// Quarta 4
		// Quinta 5
		// Sexta 6
		// Sabado 7

		System.out.println("Digite o nome da semana: ");
		String semana = dia.next();

		if (semana.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (semana.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		} else if (semana.equalsIgnoreCase("Terça")) {
			System.out.println("3");
		} else if (semana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if (semana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if (semana.equalsIgnoreCase("Sextta")) {
			System.out.println("6");
		} else if (semana.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Inválido!");
		}
	}
}

