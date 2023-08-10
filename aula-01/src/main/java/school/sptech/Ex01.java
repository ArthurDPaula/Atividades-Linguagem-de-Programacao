package school.sptech;

public class Ex01 {
    public static void main(String[] args) {
        Integer filhosBebe = 0;
        Integer filhosCriança = 0;
        Integer filhosAdolescente = 2;

        Integer filhosTotal = filhosBebe+filhosCriança+filhosAdolescente;
        Double valorFinal = filhosBebe*25.12 + filhosCriança*15.88 + filhosAdolescente*12.44;

        System.out.println("Você tem um total de "+filhosTotal +" filhos e vai receber R$"+valorFinal +" de bolsa");
    }
}
