package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.Nota;


public abstract class AlunoDeBiologicas extends Aluno {

	public AlunoDeBiologicas(String nome) {
		super(nome);
    	super.notas.clear();
    	super.notas.add(new Nota(Nota.DISCIPLINA1));
    	super.notas.add(new Nota(Nota.CALCULO1));    	
    	super.notas.add(new Nota(Nota.BIO_ENG));    	
    	super.notas.add(new Nota(Nota.SOCIOLOGIA));    	
    	}
}