package com.ciandt.faculdade;

import com.ciandt.faculdade.outros.PerguntasUtil;

public class TestaCalculoMedia {
	public static void main(String[] args) {
		//perguntasPara1Alunos();
		criarMuitosAlunos();
	}	
	
	public static void criarMuitosAlunos() {
		String nomes[] = {"Pedro","River", "caio"};
		int cursos[] = {2, 4, 3};
		boolean especial[] = {false, true, false};
		Aluno alunos[] = new Aluno[nomes.length];
		AlunoFactory fabricaAlunos = new AlunoFactory();
		
		// fazer um for-loop que cria todos os alunos do vetor "nomes" acima
        // de acordo com o curso do vertor "cursos"
        // os alunos criados devem ser salvos no vetor "alunos" na respectiva posiçõa
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = fabricaAlunos.criaAluno(nomes[i], cursos[i]);
			alunos[i].setEspecial(especial[i]);
		}
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.println(alunos[i].getNome() + " " + alunos[i]
						+ " " + alunos[i].getEspecial()); 
			} else {
				System.out.println(nomes[i] + " Curso invalido");
			}
		 }
	}
	
	public static void perguntasPAra1Aluno() {
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
				aluno.perguntaNotas();
				aluno.calculaMedia();

				System.out.println("O(A) situacao do aluno " + aluno.getNome()
						+ " tem média " + aluno.getMedia() 
						+ " e está " + aluno.pegaSituacao());
			}
		}
		System.out.println("Encerrando sistema.");
	}
}