package com.ciandt.faculdade;

import java.util.LinkedList;
import java.util.List;

public abstract class Aluno {
	
	private String nome;
	private boolean especial = false;
	protected List<Nota> notas = new LinkedList<>();
    protected double media = 0;
    
    public Aluno (String nome) {//construtor
        this.nome = nome;
        notas.add(new Nota(Nota.DISCIPLINA1));
        notas.add(new Nota(Nota.DISCIPLINA2));
    }
    
    public List<Nota> getNotas() {
		return notas;
	}
    
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
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
	
    public double calculaMedia() {
        double soma = 0;
    	for (Nota nota : notas){
			soma += nota.getValor();
		}
    	this.media = soma / notas.size();
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
    
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": " + this.nome;
    }
}