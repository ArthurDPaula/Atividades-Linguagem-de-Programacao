package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {

       Integer aleatorio = ThreadLocalRandom.current().nextInt(5, 10);
        System.out.println(aleatorio);
    }
}
