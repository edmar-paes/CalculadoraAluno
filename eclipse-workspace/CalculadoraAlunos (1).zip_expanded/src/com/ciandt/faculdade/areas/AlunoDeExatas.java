package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.disciplinas.AlunoDeCalculo;
import com.ciandt.faculdade.disciplinas.AlunoDeFisica;
import com.ciandt.faculdade.outros.PerguntasUtil;

public abstract class AlunoDeExatas extends Aluno implements AlunoDeCalculo, AlunoDeFisica {

	public static final int QUANTIDADE_DE_NOTAS = 
			Aluno.QUANTIDADE_DE_NOTAS + 4;
	
	private double calc1;
	private double calc2;
	private double calc3;
	private double fisica;

	public AlunoDeExatas(String nome) {
		super(nome);
	}

	@Override
	public void perguntaNotas() {
		super.perguntaDuasNotas();
		this.perguntaDeNotaCalculo();
		this.perguntaDeNotaDeFisica();
	}

	@Override
	public double calculaMedia() {
		super.media = (super.nota1 
				+ super.nota2 
				+ this.calc1 
				+ this.calc2 
				+ this.calc3
				+ this.fisica) 
				/  AlunoDeExatas.QUANTIDADE_DE_NOTAS;
		return super.getMedia();
	}

//	@Override
//	public boolean emAnalisePeloCorpoDocente() {
//		return tratamentoEspecial.emAnalisePeloCorpoDocente();
//	}
//
//	@Override
//	public String pegaSituacao() {
//		return tratamentoEspecial.pegaSituacao();
//	}

	@Override
	public void perguntaDeNotaCalculo() {
		this.calc1 = PerguntasUtil.perguntaNota("Nota Calculo I");
		this.calc2 = PerguntasUtil.perguntaNota("Nota Calculo II");
		this.calc3 = PerguntasUtil.perguntaNota("Nota Calculo III");
	}

	@Override
	public double getNotaDeCalculo() {
		return (this.calc1 + this.calc2 + this.calc3) / 3;
	}
	
	@Override
	public void perguntaDeNotaDeFisica() {
		this.fisica = PerguntasUtil.perguntaNota("Nota Fisica");
		
	}

	@Override
	public double getNotaDeFisica() {
		return this.fisica;
	}
}