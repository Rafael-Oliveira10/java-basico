package exerciciosAula15;
//Calcula a quantidade de gasolina ou alcool vendida
//E seus descontos
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Tipo de combustível: ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int desconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                desconto = 3;
            } else {
                desconto = 5;
            }

            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                desconto = 4;
            } else {
                desconto = 6;
            }
            total = litros * precoGas;
        }

        totalDesconto = (total /100) * desconto;
        double precoAPagar = total - totalDesconto;

        System.out.println("valor a ser pago: "+precoAPagar);
        System.out.println("Total de descontos: " +totalDesconto);
        System.out.println("Preço cheio: " +total);

    }
}
