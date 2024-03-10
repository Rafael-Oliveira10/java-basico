package exerciciosAula17;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero da tabuada");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ": ");

        for (int i = 0; i <= 19; i++) {

            System.out.println(num + " X " + i + " = " + (num * i));
        }

    }
}
