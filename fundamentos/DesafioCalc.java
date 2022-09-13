package fundamentos;

import java.util.Scanner;

public class DesafioCalc {

	public static void main(String[] args) {
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = calculadora.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = calculadora.nextDouble();
		
		System.out.println("Informe a operação que deseja calcular: ");
		String op = calculadora.next();
		
		//Lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.println("Calculo "+ num1+" "+op+" "+num2+" Resultado: "+resultado );
		

	}

}
