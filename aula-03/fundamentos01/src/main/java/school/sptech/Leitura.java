package school.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Leitura {

    public static void main(String[] args) {

        // Possibilita captcao de dados
        // do terminal
        Scanner leitor =
                new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Olá " + nomeDigitado);

        System.out.println("Agora digite sua idade:");
        Integer idadeDigitada = leitor.nextInt();

        String mensagem = idadeDigitada > 30 ? "Veião" : "Jofem";

        System.out.println(mensagem);

        ThreadLocalRandom.current().nextInt();
    }

}
