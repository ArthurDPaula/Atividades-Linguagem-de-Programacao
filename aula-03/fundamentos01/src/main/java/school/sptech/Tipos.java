
package school.sptech;

/*
        Classes -> representa um obj
        Interface -> especie de contrato
        Enum -> enumeradores, lista

        record
        annotation
 */
public class Tipos {

    public static void main(String[] args) {

        String nome = "Diego";

        /*
            Em Java os tipos não são dinâmicos
         */
        // nome = 30;

        /*

            -> Integer = 10
            -> Double = 0.1

            * BigDecimal
            * Float

            String - "Diego Brito"

            Boolean = true, false
        */

        Integer idade = 10;
        Integer numeroInteiro2;

        int teste = 10;

        // Não recomendo...
        Integer num1, num2 = 20, num3;

        Double numeralReal = 0.10;

        // is ou has
        Boolean isPago = true;
        Boolean maiorIdade = false;

        Double resultadoPow = Math.pow(2.0, 5.0);

        System.out.println("Resultado pow: " + resultadoPow);

        /*

            Classes Wrapper x tipos primitvos

            Integer x int
            Double x double
            Boolean x boolean
         */

        System.out.println(nome + " " + idade);
        System.out.println("Manoel Almeida");


        Character x = 'x';
        char x2 = 'x';
    }
}