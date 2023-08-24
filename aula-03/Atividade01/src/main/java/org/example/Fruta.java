package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean hasFruta = false;
        List<String> frutas = new ArrayList();
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Caju");
        frutas.add("Banana");
        frutas.add("Maracuja");
        System.out.println("Digite uma fruta");
        String frutaDigitada = leitor.nextLine();
        for (int i = 0; i < frutas.size(); i++) {
            if (frutaDigitada.equalsIgnoreCase(frutas.get(i))){
                hasFruta = true;
            };
        }
        if (hasFruta){
            System.out.println("A fruta %s existe na lista".formatted(frutaDigitada));
        }else {
            System.out.println("A fruta %s não existe na lista".formatted(frutaDigitada));
        }
    }
}
