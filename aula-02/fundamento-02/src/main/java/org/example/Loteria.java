package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escolha um número de 0 a 10");
        Integer numeroEscolhido = leitor.nextInt();
        Integer numeroSorteado;
        Integer posicaoNumeroCompativel = 0;
        String msg;

        do {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println("Número sorteado: "+ numeroSorteado);
            posicaoNumeroCompativel++;
            msg = "Vezes sorteado: "+ posicaoNumeroCompativel;
        }while (numeroSorteado != numeroEscolhido);

        if (posicaoNumeroCompativel <= 3){
            System.out.println("\nVocê é MUITO sortudo!");
            System.out.println(msg);
        }else if (posicaoNumeroCompativel <= 10) {
            System.out.println("\nVocê é sortudo!");
            System.out.println(msg);
        }else if (posicaoNumeroCompativel > 10){
            System.out.println("\nÉ melhor você parar de apostar e ir trabalhar");
            System.out.println(msg);
        }
    }
}