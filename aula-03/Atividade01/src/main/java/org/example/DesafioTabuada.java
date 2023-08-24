package org.example;

import java.util.Scanner;

public class DesafioTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroOperacao = null;
        do {
            System.out.println("""
                Digite o número correspondente a operação desejada:
                1- Soma
                2- Multiplicação
                3- Divisão
                4- Subtração
                5- Potencia
                6- Resto da divisão
                0- Sair   
                   """);
            numeroOperacao = leitor.nextInt();
            System.out.println("Digite um número inteiro");
            Double numeroDigitado = leitor.nextDouble();
            for (Integer i = 1; i <= 10; i++) {
                Double soma = numeroDigitado + i;
                Double multiplicacao = numeroDigitado * i;
                Double divisao = (numeroDigitado / i);
                Double subtracao = numeroDigitado - i;
                Double potencia = Math.pow(numeroDigitado,i);
                Double resto = numeroDigitado%i;
                if (numeroOperacao == 1) {
                    System.out.println(String.format("""
                            %.0f + %d = %.0f
                            """, numeroDigitado, i, soma));
                } else if (numeroOperacao == 2) {
                    System.out.println(String.format("""
                            %.0f * %d = %.0f
                            """, numeroDigitado, i, multiplicacao));
                } else if (numeroOperacao == 3) {
                    System.out.println(String.format("""
                            %.0f / %d = %.2f
                            """, numeroDigitado, i, divisao));
                } else if (numeroOperacao == 4) {
                    System.out.println(String.format("""
                            %.0f - %d = %.0f
                            """, numeroDigitado, i, subtracao));
                } else if (numeroOperacao == 5) {
                    System.out.println(String.format("""
                            %.0f ^ %d = %.0f
                            """, numeroDigitado, i, potencia));
                } else if (numeroOperacao == 6) {
                    System.out.println(String.format("""
                            %.0f r %d = %.0f
                            """, numeroDigitado, i, resto));
                }
            }
        }while (numeroOperacao != 0) ;
        System.out.println("Até logo");
    }
}
