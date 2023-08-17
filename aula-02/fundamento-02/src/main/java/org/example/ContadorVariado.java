package org.example;

public class ContadorVariado {
    public static void main(String[] args) {
        for (Double i = .15; i < 5; i+=.15) {
            String msg= String.format("Número: %2f", i);
            System.out.println(msg);
        }
    }
}
