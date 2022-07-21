package com.ciandt.faculdade;

import com.ciandt.faculdade.cursos.AlunoEngSoftware;
import com.ciandt.faculdade.cursos.AlunoEstatistica;
import com.ciandt.faculdade.cursos.AlunoFilosofia;
import com.ciandt.faculdade.cursos.AlunoMedicina;
import com.ciandt.faculdade.cursos.AlunoPsicologia;

public class AlunoFactory {
	public Aluno criaAluno(String nome, int codigoCurso) {
		Aluno aluno = null;
		switch(codigoCurso) {
		case 1:
			aluno = new AlunoMedicina(nome);
			break;
		case 2:
			aluno = new AlunoEngSoftware(nome);
			break;
		case 3:
			aluno = new AlunoEstatistica(nome);
			break;
		case 4:
			aluno = new AlunoPsicologia(nome);
			break;
		case 5:
			aluno = new AlunoFilosofia(nome);
			break;
		default:
			System.err.println("Codigo do Curso Invalido!" + codigoCurso);
		}
		return aluno;
		
	}
	public Aluno criaAluno(String nome, int codigoCurso, boolean especial) {
		Aluno aluno = this.criaAluno(nome, codigoCurso);
		if (aluno != null) {
			aluno.setEspecial(especial);
		}		
		return aluno;
	}
}
