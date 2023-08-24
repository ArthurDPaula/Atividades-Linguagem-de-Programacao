package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer opcaoEscolhida = null;
        do {
            System.out.println("""
                    Escolha o que deseja fazer
                    1- Definir Meta
                    2- Depositar no cofrinho
                    3- Agitar cofrinho
                    4- Quebrar cofrinho
                    0- Sair
                    """);
            Scanner leitorOpcao = new Scanner(System.in);
            opcaoEscolhida = leitorOpcao.nextInt();
            if (opcaoEscolhida != 0 ){
                Cofrinho cofrinho1 = new Cofrinho();
                if (opcaoEscolhida == 1){
                    cofrinho1.receberMeta();
                    System.out.println("Meta estabelecida: "+cofrinho1.meta);
                    cofrinho1.situacaoCofrinho();
                }
                if (opcaoEscolhida == 2){
                    Scanner leitorDinheiroGuardar = new Scanner(System.in);
                    System.out.println("Digite quanto quer depositar: ");
                    Double valorAGuardar = leitorDinheiroGuardar.nextDouble();
                    cofrinho1.depositar(valorAGuardar);
                    cofrinho1.situacaoCofrinho();
                }
                if (opcaoEscolhida == 3){
                    cofrinho1.agitar(cofrinho1.dinheiroArmazenado);
                    Double valorReduzir = cofrinho1.agitar(cofrinho1.dinheiroArmazenado);
                    cofrinho1.dinheiroArmazenado -= valorReduzir;
                    cofrinho1.situacaoCofrinho();
                }
                if (opcaoEscolhida == 4){
                    cofrinho1.quebrar();
                    cofrinho1.situacaoCofrinho();
                }
            }
        }while (opcaoEscolhida != 0);
    }
}