package exerciciosAula13;

import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu rendimento por hora em reais?");
        double rendimentoHora = sc.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mes? ");
        int horasTrabalhadas = sc.nextInt();

        double rendimentos = horasTrabalhadas * rendimentoHora;

        System.out.println("O total de seus rendimentos esse mes foi de: " +rendimentos);

    }
}
