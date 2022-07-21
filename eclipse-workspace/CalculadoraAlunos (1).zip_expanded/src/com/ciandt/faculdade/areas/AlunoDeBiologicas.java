package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.disciplinas.AlunoDeBioEngenharia;
import com.ciandt.faculdade.disciplinas.AlunoDeCalculo;
import com.ciandt.faculdade.disciplinas.AlunoDeSociologia;
import com.ciandt.faculdade.outros.PerguntasUtil;


public abstract class AlunoDeBiologicas extends Aluno
		implements AlunoDeCalculo, AlunoDeSociologia, AlunoDeBioEngenharia {

	//só uma nota de Aluno mais 3 de Biologicas
	public static final int QUANTIDADE_DE_NOTAS = 1 + 3;
	
	private double notaDeCalculo;
	private double notaDeBioEngenharia;
	private double notaDeSociologia;

	public AlunoDeBiologicas(String nome) {
		super(nome);
	}

	@Override
	public void perguntaNotas() {
		super.nota1 = PerguntasUtil.perguntaNota("Primeira nota");
		this.perguntaDeNotaCalculo();
		this.perguntaDeNotaDeBioEngenharia();
		this.perguntaDeNotaDeSociologia();
	}

	@Override
	public double calculaMedia() {
		super.media = (super.nota1 
				+ this.getNotaDeCalculo() 
				+ this.getNotaDeBioEngenharia()
				+ this.getNotaDeSociologia()) 
				/ AlunoDeBiologicas.QUANTIDADE_DE_NOTAS;
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

	@Override
	public void perguntaDeNotaDeSociologia() {
		this.notaDeSociologia = PerguntasUtil.perguntaNota("Nota Sociologia");
	}

	@Override
	public double getNotaDeSociologia() {
		return this.notaDeSociologia;
	}

	@Override
	public void perguntaDeNotaDeBioEngenharia() {
		this.notaDeBioEngenharia = PerguntasUtil.perguntaNota("Nota Bio-Engenharia");
	}

	@Override
	public double getNotaDeBioEngenharia() {
		return this.notaDeBioEngenharia;
	}

}