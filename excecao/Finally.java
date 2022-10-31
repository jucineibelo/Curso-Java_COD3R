package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println(7 / entrada.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally rodou mesmo se deu erro na linha 15 / O finally sempre vai rodar mesmo dando erro antes");
			entrada.close();
		}

		System.out.println("Fim!");
	}
}
