package com.ciandt.faculdade.cursos;

import com.ciandt.faculdade.Nota;
import com.ciandt.faculdade.areas.AlunoDeExatas;

public class AlunoEngSoftware extends AlunoDeExatas{

	public AlunoEngSoftware(String nome) {
		super(nome);
		super.notas.add(new Nota(Nota.BIO_ENG));
	}
}
