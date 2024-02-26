package exerciciosAula13;

import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: " );

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int resultado = valor1 + valor2;

        System.out.println("A soma dos dois valores é: " + resultado);
    }
}
