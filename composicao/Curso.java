package composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	//parametros 
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	//construtor
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		
	}
	
	
	

}
