package com.ciandt.faculdade;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.faculdade.outros.PerguntasUtil;

public class TestaFaculdade {
	public static void main(String[] args) {
		perguntasPara1Alunos();
//		criarMuitosAlunos();
	}	
	
	public static void criarMuitosAlunos() {
		String nomes[] = {"Pedro","River", "caio", "Gisele"};
		int cursos[] = {2, 10, 3, 1};
		boolean especial[] = {false, true, true, false};
		List<Aluno> alunos = new ArrayList<>();
		AlunoFactory fabricaAlunos = new AlunoFactory();
		
		// fazer um for-loop que cria todos os alunos do vetor "nomes" acima
        // de acordo com o curso do vertor "cursos"
        // os alunos criados devem ser salvos no vetor "alunos" na respectiva posiçõa
		for (int i = 0; i < nomes.length; i++) {
			Aluno alunoCriado = fabricaAlunos.criaAluno(
	                nomes[i], cursos[i], especial[i]);
			if (alunoCriado != null) {
                alunos.add(alunoCriado);
            } else {
                System.err.println("Erro ao criar aluno: " + nomes[i]);
            }
		}
				
		System.out.println("Quantidade de alunos criados com sucesso: " + alunos.size());
        for (Aluno a : alunos) {
        	String textoEsp = a.getEspecial() ? " - especial" : "";
            System.out.println(a + textoEsp);
        }
	}
	
	public static void perguntasPara1Alunos() {
		System.out.println("Calculadora de media de alunos!");

		String nome = PerguntasUtil.perguntaTexto("Digite o Nome do Aluno: ");

		int tipo = PerguntasUtil.perguntaOpcao("Qual o tipo do aluno? (1 = Medicina, 2 = Eng. Software, "
				+ "3 = Estatistica, 4 = Psicologia e 5 = Filosofia)");
		Aluno aluno = new AlunoFactory().criaAluno(nome, tipo);
		
		if (aluno != null) {
			String respostaEspecial = PerguntasUtil.perguntaTexto("O aluno é especial? (Sim/Não)");
			Boolean especial = null;
			if (respostaEspecial.equalsIgnoreCase("sim") || respostaEspecial.equalsIgnoreCase("s")) {
				especial = true;
			} else if (respostaEspecial.equalsIgnoreCase("não") 
					|| respostaEspecial.equalsIgnoreCase("n")
					|| respostaEspecial.equalsIgnoreCase("nao")) {
				especial = false;
			} else {
				System.out.println("Resposta inválida!");
			}

			if (especial != null) {
				aluno.setEspecial(especial);
				PerguntasUtil.perguntaNotas(aluno);
				aluno.calculaMedia();

				System.out.println("O(A) situacao do aluno " + aluno.getNome()
						+ " tem média " + aluno.getMedia() 
						+ " e está " + aluno.pegaSituacao());
			}
		}
		System.out.println("Encerrando sistema.");
	}
}