package school.sptech;

public class Operadores {
    public static void main(String[] args) {
        /*
            +
            -
            *
            /
            %

            Math.pow(numero1, numero2);
         */

        Integer numero1 = 10;
        Integer numero2 = 10;

        Integer resultadoSoma = numero1+numero2;
        Integer resultadoSub = numero1-numero2;
        Integer resultadoMult = numero1*numero2;
        Integer resultadoDiv = numero1/numero2;

        Character x = '*';

        System.out.println("Soma: "+ resultadoSoma);
        System.out.println("Subtração: "+ resultadoSub);
        System.out.println("Multiplicação: "+ resultadoMult);
        System.out.println("Divisão: "+ resultadoDiv);

        Boolean isIgual = numero1==numero2;

        if (isIgual){
            System.out.println("É engualzinho pprt");
        }else {
            System.out.println("Nada a ver");
        }

        Integer numeroOpcao = 2;
        switch (numeroOpcao) {
            case 1:
                System.out.println("O usuário escolheu 1");
                break;

            case 2:
                System.out.println("O usuário escolheu 2");
            break;
        }
        String nome1 = "Diego";
        String nome2 = "Diego";

        if (nome1.equalsIgnoreCase(nome2)){

        }

        }
    }
