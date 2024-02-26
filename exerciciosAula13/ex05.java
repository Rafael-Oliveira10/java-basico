package exerciciosAula13;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Medida em metros: ");

        //Resolvi aplicar uma variavel do tipo double
        //Para fixar o conteudo aprendido anteriormente
        double metro = sc.nextDouble();

        double resultado = (double) metro * 100;

        System.out.println("O resultado é: " +resultado +"cm");

    }
}
