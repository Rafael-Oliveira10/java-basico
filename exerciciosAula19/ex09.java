package exerciciosAula19;
//Dividindo...
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        double[] arrayC = new double[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor do vetor A da posição: " + i);
            arrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Entre com o vetor do vetor B da posição: " + i);
            arrayB[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] / arrayB[i];
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

        System.out.println();
        //Limita o número de casas decimais exibidas no output
        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }
        scan.close();
    }
}
