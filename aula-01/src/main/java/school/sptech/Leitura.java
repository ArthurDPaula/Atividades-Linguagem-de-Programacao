package school.sptech;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //Captação de dados do Console
        Scanner leitor =
                new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeDigitado = leitor.nextLine();
        System.out.println("Olá "+ nomeDigitado);

        System.out.println("Agora digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        System.out.println("Olá "+ idadeDigitada);
    }
}
