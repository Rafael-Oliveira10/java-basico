package exerciciosAula19;

import java.util.Scanner;
//Solicita os valores das 10 posições do array e devolve a multiplicação de cada uma
//A multiplicação é feita usando o valor da posição [i] se i for a quarta posição, será 4 * n

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor da posição: " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = arrayA[i] * i;
        }
        System.out.print("Vetor A = ");

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
