package com.ciandt.faculdade;

import com.ciandt.faculdade.cursos.AlunoEngSoftware;
import com.ciandt.faculdade.cursos.AlunoEstatistica;
import com.ciandt.faculdade.cursos.AlunoFilosofia;
import com.ciandt.faculdade.cursos.AlunoMedicina;
import com.ciandt.faculdade.cursos.AlunoPsicologia;
import com.ciandt.faculdade.outros.PerguntasUtil;

public class TestaCalculoMedia {
	public static void main(String[] args) {
		System.out.println("Calculadora de media de alunos!");

		String nome = PerguntasUtil.perguntaTexto("Digite o Nome do Aluno: ");

		int tipo = PerguntasUtil.perguntaOpcao("Qual o tipo do aluno? (1 = Madicina, 2 = Eng. Software, "
				+ "3 = Estatistica, 4 = Psicologia e 5 = Filosofia)");
		if (tipo > 0 && tipo < 6) {
			Aluno aluno = null;
			switch (tipo) {
			case 1:
				aluno = new AlunoMedicina(nome);
				break;
			case 2:
				aluno = new AlunoEngSoftware(nome);
				break;
			case 3:
				aluno = new AlunoEstatistica(nome);
				break;
			case 4:
				aluno = new AlunoPsicologia(nome);
				break;
			case 5:
				aluno = new AlunoFilosofia(nome);
				break;
			}
			aluno.perguntaNotas();
			aluno.calculaMedia();

			System.out.println("A situacao do aluno " + aluno.getNome());
			System.out.println("é " + aluno.pegaSituacao());
		} else {
			System.out.println("Tipo do aluno invalido!");
		}
	}
}