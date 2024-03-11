package exerciciosAula19;
//Pegando o resto da divisão
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor da posição: " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = arrayA[i] % 2;
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
