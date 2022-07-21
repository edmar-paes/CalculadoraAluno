package com.ciandt.faculdade.cursos;

import com.ciandt.faculdade.areas.AlunoDeExatas;
import com.ciandt.faculdade.disciplinas.AlunoDeBioEngenharia;
import com.ciandt.faculdade.outros.PerguntasUtil;


public class AlunoEngSoftware extends AlunoDeExatas implements AlunoDeBioEngenharia {

	public static final int QUANTIDADE_DE_NOTAS = 
			AlunoDeExatas.QUANTIDADE_DE_NOTAS + 1;
	
	private double notaDeBioEngenharia;

	public AlunoEngSoftware(String nome) {
		super(nome);
	}

	@Override
	public double calculaMedia() {
//		super.media = (super.nota1 
//		+ super.nota2 
//		+ super.getNotaDeCalculo() * 3 
//		+ this.getNotaDeBioEngenharia()) / 6;
		super.media = (super.calculaMedia() * AlunoDeExatas.QUANTIDADE_DE_NOTAS
		+ this.getNotaDeBioEngenharia()) / AlunoEngSoftware.QUANTIDADE_DE_NOTAS;
		return super.getMedia();
	}

	@Override
	public void perguntaNotas() {
		super.perguntaNotas();
		this.perguntaDeNotaDeBioEngenharia();
	}

	@Override
	public void perguntaDeNotaDeBioEngenharia() {
		this.notaDeBioEngenharia = PerguntasUtil.perguntaNota("Nota Bio-Engenharia");
	}

	@Override
	public double getNotaDeBioEngenharia() {
		return notaDeBioEngenharia;
	}

}
