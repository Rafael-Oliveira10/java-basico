package exerciciosAula19;
//Criando um array de 5 posições e pedindo os dados ao usuario e os apresentando na tela.
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[5];
        int[] arrayB = new int[5];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor da posição: " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = arrayA[i];
        }
        // OU
        /*for(int i=0; i<arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }*/

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
