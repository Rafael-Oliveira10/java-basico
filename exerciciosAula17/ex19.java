package exerciciosAula17;
//Solicita uma quantidade de notas, soma e calcula a média

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.println("Insira a nota: " + (i + 1));
            nota = scan.nextDouble();

            soma += nota;
        }
        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        scan.close();
    }
}
