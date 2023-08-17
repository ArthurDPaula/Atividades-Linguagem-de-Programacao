package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votos4Queijos = 0;
        String maisVotadoStr = "";
        Integer maisVotado = null;
        for (int i = 0; i < 10; i++) {
            Integer voto = ThreadLocalRandom.current().nextInt(1,4);
            if (voto == 1){
                votosMussarela++;
            }else if (voto == 2){
                votosCalabresa++;
            }else if (voto == 3){
                votos4Queijos++;
            }
            if (votosMussarela>votosCalabresa){
                maisVotadoStr= "Mussarela";
                maisVotado= votosMussarela;
            }else if (votosCalabresa > votos4Queijos){
                maisVotadoStr= "Calabresa";
                maisVotado= votosCalabresa;
            }else {
                maisVotadoStr= "Quatro-Queijos";
                maisVotado= votos4Queijos;
            }
        }
        System.out.println(String.format("Mussarela: %d\nCalabresa: %d\nQuatro-Queijos: %d",
                votosMussarela, votosCalabresa, votos4Queijos));
        System.out.println(String.format("Mais votado: %s com %d votos",maisVotadoStr,maisVotado));
    }
}
