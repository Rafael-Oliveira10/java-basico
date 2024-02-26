package exerciciosAula13;

import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        int valor2 = sc.nextInt();

        int resultado = valor1 + valor2;

        System.out.println("A soma dos dois valores é: " + resultado);
    }
}
