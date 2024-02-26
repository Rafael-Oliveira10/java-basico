package exerciciosAula13;

import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a medida da base do quadrado: ");

        double base = sc.nextDouble();

        System.out.println("Insira a medida da altura do quadrado");

        double altura = sc.nextDouble();
        double Area = base * altura;

        System.out.println("A area do quadrado é: " + Area);

        double dobroArea = base * altura * 2;

        System.out.println("O dobro da area do quadrado é: " + dobroArea);

        //Gostaria de fazer um if else, para perguntar se o usuario gostaria de
        //Ver o resultado do dobro do calculo, porém não consegui, em breve volto

    }
}
