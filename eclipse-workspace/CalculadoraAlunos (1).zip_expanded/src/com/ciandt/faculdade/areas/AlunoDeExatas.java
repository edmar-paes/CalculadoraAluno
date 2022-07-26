package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.Nota;

public abstract class AlunoDeExatas extends Aluno{

	public AlunoDeExatas(String nome) { //Construtor
		super(nome);
		super.notas.clear();
		super.notas.add(new Nota(Nota.CALCULO1));
		super.notas.add(new Nota(Nota.CALCULO2));
		super.notas.add(new Nota(Nota.CALCULO3));
		super.notas.add(new Nota(Nota.FISICA));
	}
}