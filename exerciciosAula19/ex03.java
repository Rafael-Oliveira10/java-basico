package exerciciosAula19;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[15];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor da posição: " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = arrayA[i] * arrayA[i];
        }

        System.out.print("Vetor A = ");
        // Multiplicando
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
        scan.close();
    }
}
