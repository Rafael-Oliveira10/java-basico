package exerciciosAula13;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as suas 4 notas bimestrais: ");

        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        int nota4 = sc.nextInt();

        int media = nota1 + nota2 + nota3 + nota4;
        double mediaFinal = (double) media / 4;

        System.out.println("Sua nota média foi: " + mediaFinal);

    }
}
