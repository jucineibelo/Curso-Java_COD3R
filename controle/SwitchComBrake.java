package controle;

import java.util.Scanner;

public class SwitchComBrake {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe uma nota: ");
		int nota = scan.nextInt();

		switch (nota) {
		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "B";
			break;
		case 8:
			conceito = "C";
			break;
		default:
			conceito = "não encontrado!";
		}
		System.out.println("Conceito é: "+ conceito);
	}

}
