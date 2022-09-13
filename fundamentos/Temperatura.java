package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		
		// (F - 32) * 5/9 = C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		
		System.out.println("Insira a temperatura em graus Fahrenheit: ");
		double fahrenheit = temperatura.nextDouble();
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A conversão de "+fahrenheit+" graus Faherenheit é: " +celsius+" graus Celsius");
	
		
		

	}

}
