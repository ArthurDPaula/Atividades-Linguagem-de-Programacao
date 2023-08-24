package school.sptech;

public class LacosDeRepeticao {

  public static void main(String[] args) {

    /*
      As estruturas de repetição no Java são idênticas as do JS
      for, while e 'do while'

      Existem outros laços de repetição específicos para iteração de vetores e listas
     */

    System.out.println("for de 0 a 10");

    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("while de 0 a 10");
    Integer contador = 0;
    while (contador <= 10) {
      System.out.println(contador);
      contador++;
    }

    /*
      O 'do while' executa a instrução dentro do bloco 'do' pelo menos
      uma vez antes de verificar a condição
    */

    System.out.println("do while de 0 a 10");

    Integer contador2 = 0;

    do {
      System.out.println(contador2);
      contador2++;
    } while (contador2 <= 10);
  }
}
