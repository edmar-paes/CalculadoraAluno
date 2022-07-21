package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.disciplinas.AlunoDeSociologia;
import com.ciandt.faculdade.outros.PerguntasUtil;

public abstract class AlunoDeHumanas extends Aluno implements AlunoDeSociologia {

	public AlunoDeHumanas(String nome) {
		super(nome);
	}

	protected double nota3;
	protected double nota4;
	private double notaDeSociologia;

	@Override
	public void perguntaNotas() {
		super.perguntaDuasNotas();
		this.nota3 = PerguntasUtil.perguntaNota("Terceira Nota");
		this.nota4 = PerguntasUtil.perguntaNota("Quarta Nota");
	}

	@Override
	public double calculaMedia() {
		super.media = (super.nota1 
		+ super.nota2 
		+ this.nota3 
		+ this.nota4 
		+ this.getNotaDeSociologia()) / 5;
		return super.getMedia();
	}

	@Override
	public void perguntaDeNotaDeSociologia() {
		this.notaDeSociologia = PerguntasUtil.perguntaNota("Nota Sociologia");
	}

	@Override
	public double getNotaDeSociologia() {
		return this.notaDeSociologia;
	}

}