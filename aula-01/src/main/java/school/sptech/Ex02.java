package school.sptech;

public class Ex02 {
    public static void main(String[] args) {
        Integer tempoAquecendo = 5;
        Integer tempoAerobicos = 10;
        Integer tempoMusculacao = 30;
        Integer tempoTotal = tempoAerobicos+tempoAquecendo+tempoMusculacao;

        Integer caloriasPerdidas = tempoAquecendo*12+tempoAerobicos*20+tempoMusculacao*25;

        System.out.println("Olá, Jorge. Você fez um total de "+tempoTotal+" minutos de exercícios e perdeu cerca de "+
                caloriasPerdidas+" calorias" );
    }
}
