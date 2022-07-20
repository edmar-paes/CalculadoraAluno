package com.ciandt.faculdade.outros;

import java.util.Scanner;

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
}
