package school.sptech;

public class Ex03 {
    public static void main(String[] args) {
        Integer valorUnitProd = 1;
        Integer qtdeVendida = 5;
        Integer valorPago = 10;
        Double troco = (double) (valorPago - valorUnitProd*qtdeVendida);

        System.out.println("Seu troco será de R$"+troco);
    }
}
