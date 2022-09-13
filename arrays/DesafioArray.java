package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner exerc = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		int qtdDeNotas = exerc.nextInt();
		
		double [] notas = new double [qtdDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota: "+ (i + 1)+": ");
			notas[i] = exerc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println("A média é " + media + "!");
		
		exerc.close();
		
		
		
		
		
	}

}
