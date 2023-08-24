package org.example;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota 2:");
        Double nota2 = leitor.nextDouble();
        Double media =(nota1 * 0.4 + nota2 * 0.6);
        String mensagem = String.format("A média das notas é: %.1f",media);
        System.out.println(mensagem);
    }
}
