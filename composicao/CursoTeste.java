package composicao;

public class CursoTeste {

	public static void main(String[] args) {


		Aluno aluno1 = new Aluno("Jucinei");
		Aluno aluno2 = new Aluno("Juci");
		Aluno aluno3 = new Aluno("Jucilei");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("C++");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println(curso3.nome);
			System.out.println("matriculado: "+aluno.nome);
			
		}
	}

}
