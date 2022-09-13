package controle;

import java.util.Scanner;

public class Else {

	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		double num1 = novo.nextDouble();
		
		if (num1 % 2 == 0) {
			System.out.println(num1 + " é par!");
		} else {
			System.out.println(num1 + " é impar!");
		}
		

	}

}
