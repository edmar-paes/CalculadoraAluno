package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.disciplinas.AlunoDeCalculo;
import com.ciandt.faculdade.outros.PerguntasUtil;

public class AlunoDeBiologicas extends Aluno implements AlunoDeCalculo {

	private double notaDeCalculo;

	public AlunoDeBiologicas(String nome) {
		super(nome);
	}

	@Override
	public void perguntaNotas() {
		super.nota1 = PerguntasUtil.perguntaNota("Primeira nota");
		this.perguntaDeNotaCalculo();
	}

	@Override
	public double calculaMedia() {
		super.media = (super.nota1 + this.getNotaDeCalculo()) / 2;
		return super.media;
	}

	@Override
	public void perguntaDeNotaCalculo() {
		this.notaDeCalculo = PerguntasUtil.perguntaNota("Nota Calculo I");
	}

	@Override
	public double getNotaDeCalculo() {
		return this.notaDeCalculo;
	}
}