package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.Nota;

public abstract class AlunoDeHumanas extends Aluno{

	public AlunoDeHumanas(String nome) {
		super(nome);
		super.notas.clear();
		super.notas.add(new Nota(Nota.DISCIPLINA3));
		super.notas.add(new Nota(Nota.DISCIPLINA4));
		super.notas.add(new Nota(Nota.SOCIOLOGIA));
	}
}