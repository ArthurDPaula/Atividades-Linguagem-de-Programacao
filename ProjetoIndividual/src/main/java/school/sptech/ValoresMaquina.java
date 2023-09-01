package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class ValoresMaquina {
    private Double ram;
    private Double cpu;
    private Double disco;
    public Double sortearRam(){
        ram = ThreadLocalRandom.current().nextDouble(0.0,100.0);
        return ram;
    }
    public Double sortearCpu(){
        cpu = ThreadLocalRandom.current().nextDouble(0.0,100.0);
        return cpu;
    }
    public Double sortearDisco(){
        disco = ThreadLocalRandom.current().nextDouble(0.0,100.0);
        return disco;
    }
    public void exibirMensagem(){
        System.out.println("""
                -------------
                CPU: %.1f%%
                RAM: %.1f%%
                Disco: %.1f%%
                -------------
                """.formatted(cpu, ram, disco));
    }
}