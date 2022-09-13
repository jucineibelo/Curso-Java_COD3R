package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {

		Scanner teste = new Scanner(System.in);

		int num = 1;
		int cont = 0;

		while (num != 0) {
			System.out.println("Insira um número: ");
			num = teste.nextInt();
			cont++;

		}

	}

}
