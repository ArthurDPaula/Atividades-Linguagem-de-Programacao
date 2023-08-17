package org.example;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista desejada: ");
        Integer tamanhoVetor = leitor.nextInt();

        Integer[] vetNumerosInteiros = new Integer[tamanhoVetor];
        Integer somaTotal = 0;

        for (Integer i = 0; i < tamanhoVetor; i++) {
            System.out.println(String.format("Digite o valor do %d numero: ",i+1));
            Integer numeroDigitado = leitor.nextInt();
            vetNumerosInteiros[i] = numeroDigitado;
        }

        for (int i = 0; i < vetNumerosInteiros.length; i++) {
            somaTotal+= vetNumerosInteiros[i];
        }
        System.out.println(String.format("Soma da lista: %d", somaTotal));
    }
}
