package school.sptech;

import java.util.Scanner;

public class Ex01v2 {
    public static void main(String[] args) {
        Scanner leitor =
                new Scanner(System.in);
        System.out.println("Digite quantos filhos você tem de 0 a 3 anos");
        Integer filhosBebe = leitor.nextInt();

        System.out.println("Digite quantos filhos você tem de 4 a 16 anos");
        Integer filhosCriança = leitor.nextInt();

        System.out.println("Digite quantos filhos você tem de 17 a 18 anos");
        Integer filhosAdolescente = leitor.nextInt();

        Integer filhosTotal = filhosBebe+filhosCriança+filhosAdolescente;
        Double valorFinal = filhosBebe*25.12 + filhosCriança*15.88 + filhosAdolescente*12.44;

        System.out.println("Você tem um total de "+filhosTotal +" filhos e vai receber R$"+valorFinal +" de bolsa");
    }
}
