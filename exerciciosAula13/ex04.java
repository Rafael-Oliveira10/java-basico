package exerciciosAula13;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //melhorando um pouco esse código, separando as notas
        System.out.println("Insira a sua primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Insira a sua segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Insira a sua terceira nota: ");
        int nota3 = sc.nextInt();

        System.out.println("Insira a sua quarta nota: ");
        int nota4 = sc.nextInt();

        double media = (double) (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("Sua nota média foi: " + media);

    }
}
