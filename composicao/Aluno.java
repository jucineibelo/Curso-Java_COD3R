package composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	// parametros
	final String nome;
	final List<Curso> cursos = new ArrayList<>();

	// construtor

	Aluno(String nome) {
		this.nome = nome;
	}

	// metodos

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);

	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}

		}
		return null;
	}

	public String toString() {
		return nome;
	}

}
