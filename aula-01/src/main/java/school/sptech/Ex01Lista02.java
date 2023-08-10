package school.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex01Lista02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um número de 0 a 10");
        Integer numeroEscolhido = leitor.nextInt();
        Integer numeroSorteado =ThreadLocalRandom.current().nextInt(11);
        Integer contador = 0;

        for (; numeroSorteado != numeroEscolhido; contador++) {
            System.out.println(numeroSorteado);
            numeroSorteado = ThreadLocalRandom.current().nextInt(11);
        }
        if (contador <=3) {
            System.out.println("Você é MUITO sortudo");
            System.out.println(numeroSorteado);
        }else if (contador<=10){
            System.out.println("Você é sortudo");
            System.out.println(numeroSorteado);
        }else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
            System.out.println(numeroSorteado);
        }
        }
    }
