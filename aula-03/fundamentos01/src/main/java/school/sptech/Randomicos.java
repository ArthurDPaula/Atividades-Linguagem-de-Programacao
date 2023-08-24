package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {

  public static void main(String[] args) {

    /*
      No Java além da função Math.random() que possúi o mesmo comportamento no JS,
      podemos utilizar a classe ThreadLocalRandom que possúi alguns métodos que facilitam
      a geração de números aleatórios.
    */

    Integer aleatorio;

    // gera um número inteiro aleatório
    aleatorio = ThreadLocalRandom.current().nextInt();

    // gera um número inteiro aleatório de 5 a 10
    aleatorio = ThreadLocalRandom.current().nextInt(5, 11);

    // gera um número inteiro aleatório de 0 a 10
    aleatorio = ThreadLocalRandom.current().nextInt(11);

    System.out.println(aleatorio);

    // Podemos gerar números Double aleatórios também, assim como para outros tipos como
    // Boolean, Long, Float
    Double aleatorioReal = ThreadLocalRandom.current().nextDouble(0, 10.1);
    System.out.printf("%.2f", aleatorioReal); // Exibindo número com 2 casas decimais
  }
}
