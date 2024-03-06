package exerciciosAula15;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Os anos bissextos possuem um dia a mais que um ano" + " normal");
        System.out.println("Vamos descobrir se o ano informado é bissexto?");
        System.out.println("Insira um ano: ");

        int ano = scan.nextInt();
        boolean bissexto;

        if((ano % 4 == 0) ||(ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("O ano é bissexto!");
            bissexto = true;
        }else {
            System.out.println("O ano não é bissexto!");
            bissexto = false;
        }
    }
}
