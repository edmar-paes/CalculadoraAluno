package com.ciandt.faculdade.areas;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.outros.AlunoEspecial;
import com.ciandt.faculdade.outros.AlunoEspecialHelper;
import com.ciandt.faculdade.outros.PerguntasUtil;

public class AlunoDeHumanas extends Aluno implements AlunoEspecial {

    private AlunoEspecialHelper tratamentoEspecial;

    public AlunoDeHumanas(String nome) {
        super(nome);
        tratamentoEspecial = new AlunoEspecialHelper(this);
    }
    
    protected double nota3 = 0;
    protected double nota4 = 0;
    
    @Override
    public void perguntaNotas() {
        super.perguntaDuasNotas();
        this.nota3 = PerguntasUtil.perguntaNota("Terceira Nota");
        this.nota4 = PerguntasUtil.perguntaNota("Quarta Nota");
    }
    
    @Override
    public double calculaMedia() {
        super.media = (super.nota1 + super.nota2 + this.nota3 + this.nota4) / 4;
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
}