package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 7;
		notasAlunoA[2] = 6.7;

		double total = 0;

		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];

		}

		double totalAlunoB = 0;
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
