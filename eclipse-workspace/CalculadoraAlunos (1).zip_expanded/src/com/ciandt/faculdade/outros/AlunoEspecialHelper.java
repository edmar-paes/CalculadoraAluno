package com.ciandt.faculdade.outros;

import com.ciandt.faculdade.Aluno;

public class AlunoEspecialHelper {

    private static final int NOTA_DE_CORTE = 7;
    private Aluno aluno;

    public AlunoEspecialHelper(Aluno aluno) {
        this.aluno = aluno;
    }

    public String pegaSituacao() {
        if (!emAnalisePeloCorpoDocente()) {
            return "APROVADO";
        }
        return "EM ANALISE PELO CORPO DOCENTE";
    }

    public boolean emAnalisePeloCorpoDocente() {
        return aluno.getMedia() < NOTA_DE_CORTE;
    }
}