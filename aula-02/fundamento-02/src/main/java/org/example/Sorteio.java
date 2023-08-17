package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer posicaoPrimeiroSorteio = null;
        Integer numeroDePares = 0;
        Integer numeroDeImpares = 0;
        Boolean isPrimeiraVez = true;

        Scanner leitor = new Scanner(System.in);

        Integer numeroEscolhido;

        do {
            System.out.println("Digite um número de 1 a 100:");
            numeroEscolhido = leitor.nextInt();
        }while (numeroEscolhido < 1 || numeroEscolhido > 100);


        for (int i = 0; i < 200; i++) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);

            if (numeroSorteado.equals(numeroEscolhido) && isPrimeiraVez){
                posicaoPrimeiroSorteio = i + 1;
                isPrimeiraVez = false;
            }
            if (numeroSorteado % 2 == 0){
                numeroDePares++;
            }else {
                numeroDeImpares++;
            }
        }

        System.out.println("Posição primeiro sorteio: "+ posicaoPrimeiroSorteio);
        System.out.println("Número de Pares: "+ numeroDePares);
        System.out.println("Número de Impares: "+ numeroDeImpares);
    }
}
