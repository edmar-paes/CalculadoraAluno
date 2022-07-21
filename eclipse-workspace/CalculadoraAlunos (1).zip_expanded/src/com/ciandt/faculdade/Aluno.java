package com.ciandt.faculdade;

import com.ciandt.faculdade.outros.PerguntasUtil;

public abstract class Aluno {

	public static final int QUANTIDADE_DE_NOTAS = 2;
	
	private String nome;
	private boolean especial = false;
    protected double nota1 = 0;
    protected double nota2 = 0;
    protected double media = 0;
    
    
    public Aluno (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public boolean getEspecial() {
        return especial;
    }
   
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
	public double getMedia() {
        return this.media;
    }
    
    public abstract void perguntaNotas();

    protected void perguntaDuasNotas() {
        this.nota1 = PerguntasUtil.perguntaNota("Primeira Nota");
        this.nota2 = PerguntasUtil.perguntaNota("Segunda Nota");
    }
    
    public double calculaMedia() {
        this.media = (this.nota1 + this.nota2) / QUANTIDADE_DE_NOTAS;
        return getMedia();
    }
    
    public String pegaSituacao() {
        if (this.media >= 7) {
            return "APROVADO";
        }
        if (this.getEspecial()) {
            return "EM ANALISE PELO CORPO DOCENTE";
        }
        if (this.media >= 5) {
            return "EM RECUPERAÇÃO";
        }
        return "EM REPROVADO";
    }
}