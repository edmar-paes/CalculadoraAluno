package com.ciandt.faculdade.outros;

import java.util.Scanner;

import com.ciandt.faculdade.Aluno;
import com.ciandt.faculdade.Nota;

public class PerguntasUtil {

    private static Scanner pergunta(String titulo) {
        System.out.println(titulo);
        return new Scanner(System.in);
    }

    public static String perguntaTexto(String titulo) {
        Scanner scanner = pergunta(titulo);
        return scanner.nextLine();
    }

    public static int perguntaOpcao(String titulo) {
        Scanner scanner = pergunta(titulo);
        return scanner.nextInt();
    }

    public static double perguntaNota(String nome) {
        Scanner scanner = pergunta(nome + ": ");
        return scanner.nextDouble();
    }
    
    public static void perguntaNotas (Aluno aluno) {
    	for (Nota nota: aluno.getNotas() ) {
    		nota.setValor(perguntaNota(nota.getDisciplina()));
    	}
    }
}
