package exerciciosAula13;

import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o seu peso ideal?");
        System.out.println("Primeiro, precisamos saber qual, a sua altura?");

        double altura = sc.nextDouble();
        double base = 72.7;
        int base2 = 58;

        double pesoIdeal = (base * altura) - base2;

        System.out.println("O seu peso ideal é: " +pesoIdeal);
    }
}
