package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //Essa list é uma INTERFACE e não uma classe

    /*
        List listaDiferente = new ArrayList();

        listaDiferente.add("Alfa");
        listaDiferente.add(15);
        listaDiferente.add(true);
        listaDiferente.add(1.7);
     */
        Integer[] notas = {1,2,3};

        List<Integer> numerosInteiros = new ArrayList();

        numerosInteiros.add(5);
        numerosInteiros.add(10);
        numerosInteiros.add(15);
        numerosInteiros.add(20);
        numerosInteiros.add(25);

        /*
        System.out.println(numerosInteiros);
        System.out.println("-".repeat(20));
        System.out.println(notas);
         */
        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.println(numerosInteiros.get(i));
        }
        System.out.println("-".repeat(20));
        numerosInteiros.add(0, 8);
        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.println(numerosInteiros.get(i));
        }
        System.out.println("-".repeat(20));
        numerosInteiros.remove(0);
        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.println(numerosInteiros.get(i));
        }
    }
}