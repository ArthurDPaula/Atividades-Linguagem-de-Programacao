package school.sptech;

import java.util.Scanner;

public class Ex02v2 {
    public static void main(String[] args) {
        Scanner leitor =
                new Scanner(System.in);

        System.out.println("Digite quantos minutos de aquecimento:");
        Integer tempoAquecendo = leitor.nextInt();

        System.out.println("Digite quantos minutos de aeróbicos:");
        Integer tempoAerobicos = leitor.nextInt();

        System.out.println("Digite quantos minutos de aquecimento:");
        Integer tempoMusculacao = leitor.nextInt();

        Integer tempoTotal = tempoAerobicos+tempoAquecendo+tempoMusculacao;
        Integer caloriasPerdidas = tempoAquecendo*12+tempoAerobicos*20+tempoMusculacao*25;

        System.out.println("Olá, Jorge. Você fez um total de "+tempoTotal+" minutos de exercícios e perdeu cerca de "+
                caloriasPerdidas+" calorias" );
    }
}
