package org.example;

public class Aula02 {
    public static void main(String[] args) {

        String nome = "Arthur";
        String sobrenome = "de Paula";
        Double altura = 10000.83;
        Integer idade = 20;

        //String msg = String.format("Meu nome é %s %s tenho %d anos e tenho %,.2f m de altura",
        //        nome,sobrenome, idade, altura);
        //System.out.println(msg);

        String msg = """
                <body>
                    <p>
                    Meu nome é %s %s tenho %d anos e tenho %,.2f m de altura</p>
                </body>
                """.formatted(nome, sobrenome, idade, altura);
        System.out.println(msg);
    }
}
