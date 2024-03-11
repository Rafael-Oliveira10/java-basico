package exerciciosAula17;
//Calcula o fatorial do número inserido pelo usuário

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println(num + "! = " + num + " * ");

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
        scan.close();
    }
}
