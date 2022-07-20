package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.disciplinas.AlunoDeCalculo;
import com.ciandt.faculdade.outros.AlunoEspecial;
import com.ciandt.faculdade.outros.AlunoEspecialHelper;
import com.ciandt.faculdade.outros.PerguntasUtil;

public class AlunoDeExatas extends Aluno implements AlunoEspecial, AlunoDeCalculo {

	private AlunoEspecialHelper tratamentoEspecial;
	private double calc1;
	private double calc2;
	private double calc3;

	public AlunoDeExatas(String nome) {
		super(nome);
		tratamentoEspecial = new AlunoEspecialHelper(this);
	}

	@Override
	public void perguntaNotas() {
		super.perguntaDuasNotas();
		this.perguntaDeNotaCalculo();
	}

	@Override
	public double calculaMedia() {
		super.media = (super.nota1 + super.nota2 + this.calc1 + this.calc2 + calc3) / 5;
		return super.getMedia();
	}

	@Override
	public boolean emAnalisePeloCorpoDocente() {
		return tratamentoEspecial.emAnalisePeloCorpoDocente();
	}

	@Override
	public String pegaSituacao() {
		return tratamentoEspecial.pegaSituacao();
	}

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
}