package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gui", 6.1);
		Aluno a3 = new Aluno("Luca", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;     // 1 = primeiro objeto (parametro) é melhor do que o segundo.
			if (aluno1.nota < aluno2.nota) return -1;   // -1 = segundo objeto (parametro) é melhor do que o primeiro.
			return 0;                                   // 0 = os dois objetos (parametros) são iguais.
			};
			
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return -1;
			if (aluno1.nota < aluno2.nota) return  1;
			return 0;
			};
						
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
		
	}

}
