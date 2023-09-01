package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorUsuario = new Scanner(System.in);
        Scanner leitorSenha = new Scanner(System.in);
        Integer opcao = -1;
        ValoresMaquina maquina1 = new ValoresMaquina();
        String usuario = "alfa";
        String senha = "alfa123";
        String usuarioDigitado;
        String senhaDigitada;
        do {
            System.out.println("Digite o seu usuário:");
            usuarioDigitado = leitorUsuario.nextLine();
            System.out.println("Digite a sua senha:");
            senhaDigitada = leitorSenha.nextLine();
            if (usuarioDigitado.equalsIgnoreCase(usuario) && senhaDigitada.equalsIgnoreCase(senha)){
                System.out.println("Logado com sucesso");
                do {
                    System.out.println("""
                    1) Verificar computador
                    0) Sair
                    """);
                    opcao = leitor.nextInt();
                    if (opcao == 1){
                        for (int i = 0; i < 30; i++) {
                            maquina1.sortearCpu();
                            maquina1.sortearRam();
                            maquina1.sortearDisco();
                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            maquina1.exibirMensagem();
                        }
                    }
                }while (opcao != 0);
            }else {
                System.out.println("Senha errada! Tente novamente");
            }
        }while (opcao != 0 || opcao == -1);

        leitor.close();
        leitorUsuario.close();
        leitorSenha.close();
    }
}