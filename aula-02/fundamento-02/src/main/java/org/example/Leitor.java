package org.example;

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();

        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();

        System.out.println(String.format("Seu nome %s e idade %d",nomeDigitado, idadeDigitada));
    }
}
