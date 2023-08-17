package org.example;

import java.util.ArrayList;
import java.util.List;

public class LacoDiferente {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Alfa");
        nomes.add("Beta");
        nomes.add("Gamma");
        nomes.add("Delta");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        String separacao = "-".repeat(15);
        //For aprimorado
        System.out.println(separacao);
        for(String nomeDaVez : nomes){
            System.out.println(nomeDaVez);
        }
        System.out.println(separacao);

        nomes.forEach(nome -> System.out.println(nome));
    }
}
