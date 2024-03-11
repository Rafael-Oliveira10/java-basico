package exerciciosAula19;
//Solicita os valores das 15 posições do array e devolve a raiz quadrada de cada uma
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[15];
        double[] arrayB = new double[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Entre com o vetor da posição: " + i);
            arrayA[i] = scan.nextInt();
                //função matemática de raiz quadrada
            arrayB[i] = Math.sqrt(arrayA[i]);
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }

        System.out.println();
        //Limita o número de casas decimais exibidas no output
        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor B = ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(df.format(arrayB[i]) + " ");
        }
        scan.close();
    }
}
