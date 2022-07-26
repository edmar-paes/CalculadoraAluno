package com.ciandt.faculdade;

public class Nota {
	public static final String DISCIPLINA1 = "Nota 1";
	public static final String DISCIPLINA2 = "Nota 2";
	public static final String SOCIOLOGIA = "Sociologia";
	public static final String CALCULO1 = "Nota Calculo I";
	public static final String CALCULO2 = "Nota Calculo II";
	public static final String CALCULO3 = "Nota Calculo III";
	public static final String FISICA = "Nota Fisica";
	public static final String BIO_ENG = "Nota Bio-Engenharia";
	public static final String DISCIPLINA3 = "Nota 3";
	public static final String DISCIPLINA4 = "Nota 4";
	
	String disciplina;
	double valor;
	
	public Nota(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
