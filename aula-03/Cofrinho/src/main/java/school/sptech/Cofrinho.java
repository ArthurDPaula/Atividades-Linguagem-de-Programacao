package school.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String meta;
    Double dinheiroArmazenado = 0.1;
    Boolean isQuebrado = false;
    void receberMeta(){
        Scanner leitorMeta = new Scanner(System.in);
        System.out.println("Digite sua meta: ");
        meta = leitorMeta.nextLine();
    }
    void depositar(Double valorDepositado){
        dinheiroArmazenado += valorDepositado;
    }
    Double agitar(Double valorAtual){
        Double valorReduzir = 0.0;
        if (isQuebrado){
            System.out.println("O cofre já foi quebrado.");
        }else {
            valorReduzir = ThreadLocalRandom.current().nextDouble(dinheiroArmazenado);
        }
        return valorReduzir;
    }
    void quebrar(){
        isQuebrado = true;
        System.out.println("Crack! Você quebrou o cofrinho e tinha R$%f dentro.".formatted(dinheiroArmazenado));
    }
    void situacaoCofrinho(){
        System.out.println("""
                ------------------------
                Cofrinho
                Meta: %s
                ValorAtual: R$%.2f
                Situação: %s
                ------------------------
                """.formatted(meta, dinheiroArmazenado, isQuebrado ? "Quebrado":"Novo"));
    }
}
