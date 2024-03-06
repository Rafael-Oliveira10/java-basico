package exerciciosAula15;

import java.util.Scanner;
//Calculando venda de carnes em açougue.
public class ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o corte que você deseja?");
        System.out.println("1 - File duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Qual a quantidade (kg)?");
        double qtd = scan.nextDouble();

        double precoKg = 0;
        if(tipo == 1){

            System.out.println(qtd + "kg - file duplo");
            if(qtd > 5){
                precoKg = 4.9;
            }else {
                precoKg = 5.8;
            }
        } else if(tipo == 2){
            System.out.println(qtd + "kg - Alcatra");
            if(qtd > 5){
                precoKg = 5.9;
            }else {
                precoKg = 6.8;
            }
        }else if(tipo == 3){
            System.out.println(qtd + "kg - Picanha");
            if(qtd > 5){
                precoKg = 6.9;
            }else {
                precoKg = 7.8;
            }
        }

        double total = qtd + precoKg;
        System.out.println(qtd + " Kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? Digite 1 para sim: ");
        int cartao = scan.nextInt();

        if(cartao == 1){
            double desconto = (total / 100) * 5;
            // valor total com desconto simples + desconto
            // cartão
            System.out.println("Desconto de: " +desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        }else { //valor total com desconto simples
            System.out.println("Valor a pagar: " +total);
        }
    }
}
