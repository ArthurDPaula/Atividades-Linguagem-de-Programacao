package org.example;

import java.util.Scanner;

public class Avaliador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a quantidade de notas recebidas: ");
        Integer qtdeNotas = leitor.nextInt();

        Double[] vetNotas = new Double[qtdeNotas];
        Double somaTotal = 0.0;

        for (Integer i = 0; i < qtdeNotas; i++) {
            System.out.println(String.format("Digite a nota %d: ",i+1));
            Double numeroDigitado = leitor.nextDouble();
            vetNotas[i] = numeroDigitado;
        }

        for (int i = 0; i < qtdeNotas; i++) {
            somaTotal += vetNotas[i];
        }
        Double media = somaTotal/qtdeNotas;

        System.out.println(String.format("-------------" +
                "\nNome do Aluno: %s" +
                "\nMédia: %f",nome,media));
        if (media>=6){
            System.out.println("Situação: Aprovado" +
                    "\n-------------");
        }else {
            System.out.println("Situação: Reprovado" +
                    "\n-------------");
        }

        //--SOLUÇÃO DO PROFESSOR--

//        String situacao = media >= 6 ? "Aprovado" :"Reprovado";
//
//        String mensagem = """
//                ------------------
//                Nome do aluno: %s
//                Média: %f
//                Situação: %s
//                ------------------
//                """.formatted(nome,media,situacao);
//        System.out.println(mensagem);
    }
}
