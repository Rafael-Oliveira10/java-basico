package exerciciosAula17;
//Calculando um numero elevado a potência n e mostrando o resultado

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a base: ");
        int base = scan.nextInt();

        System.out.println("Insira o expoente: ");
        int pot = scan.nextInt();

        int resultado = base;

        for (int i = 1; i < pot; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
        scan.close();
    }
}
