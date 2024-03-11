package exerciciosAula17;

import java.util.Scanner;

//Série Fibonacci
public class ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o enésimo termo da série de Fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //Primeira rodada   |   Segunda rodada
        //primeiro = 1      |   primeiro = 1
        //segundo = 1       |   segundo = 2
        //proximo = 2       |   proximo = 3
        //O segundo número soma com seu antecessor dando origem ao 'proximo'
        //E assim por diante
        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
        scan.close();
    }
}
