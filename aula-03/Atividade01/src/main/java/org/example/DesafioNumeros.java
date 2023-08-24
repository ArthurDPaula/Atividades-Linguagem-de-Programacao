import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = null;
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        Integer soma = 0;
        Integer menor = Integer.MAX_VALUE;
        Integer maior = Integer.MIN_VALUE;
        do {
            System.out.println("Digite um numero inteiro");
            numeroDigitado = leitor.nextInt();
            if (numeroDigitado!=0){
                numerosInteiros.add(numeroDigitado);
            }
        }while (numeroDigitado!=0);
        for (int i = 0; i < numerosInteiros.size(); i++) {
            Integer numeroDaVez = numerosInteiros.get(i);
            if (numeroDaVez % 2 == 0){
                numerosPares.add(numeroDaVez);
            }else {
                numerosImpares.add(numeroDaVez);
            }
            if (numeroDaVez < menor){
                menor = numeroDaVez;
            }
            if (numeroDaVez > maior){
                maior = numeroDaVez;
            }
            soma += numeroDaVez;
        }
        System.out.println("""
                Números Pares: %s
                Números Impares: %s
                Soma da lista: %d
                Menor número: %d
                Maior número: %d
                """.formatted(numerosPares, numerosImpares, soma, menor, maior));
    }
}
