package com.ciandt.faculdade;



import com.ciandt.faculdade.outros.PerguntasUtil;

public abstract class Aluno {

    protected double nota1 = 0;
    protected double nota2 = 0;
    protected double media = 0;
    private String nome;
    
    public Aluno (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
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
        this.media = (this.nota1 + this.nota2) / 2;
        return getMedia();
    }
    
    public String pegaSituacao() {
        if (this.media >= 7) {
            return "APROVADO";
        }
        if (this.media >= 5) {
            return "EM RECUPERAÇÃO";
        }
        return "REPROVADO";
    }
}