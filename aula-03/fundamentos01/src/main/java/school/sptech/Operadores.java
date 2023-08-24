package school.sptech;

/*
    Classes -> PascalCase
    ex: MinhaClasse
*/
public class Operadores {

    public static void main(String[] args) {

        /*
            +
            -
            *
            /
            %

            Math.pow(numero1, numero2)
        */

        Integer numero1 = 10;
        Integer numero2 = 10;

        //String resultado = "Soma" + numero1 + numero2;

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Mult: " + (numero1 * numero2));

        Double numeroReal1 = 1.50;
        Double numeroReal2 = 5.00;

        /*
            ==
            >
            <
            >=
            <=
            !=
            ||
            &&
        */

        Boolean isIgual = numero1 == numero2;

        String mensagem =
                numero1 == numero2 ? "é igual" : "ñ é igual";

        if (isIgual){
            System.out.println("É igual");
        }else{
            System.out.println("Não é igual");
        }

        Integer numeroOpcao = 2;

        switch(numeroOpcao){
            case 1:
                System.out.println("Usuario escolheu 1");
            break;

            case 2:
                System.out.println("Usuario escolheu 2");
            break;

            case 3:
                System.out.println("Usuario escolheu 3");
            break;

            default:
                System.out.println("Opção não encontrada.");
        }

        String nome1 = "Diego";
        String nome2 = "DIEGO";

        if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("é igual");
        }
    }
}
