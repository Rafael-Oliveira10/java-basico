package exerciciosAula17;
//Pede 5 valores ao usuário, soma e retorna uma média
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int sum = 0;
        double average;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            sum += num;
        }
        average = sum / 5;

        System.out.println("Soma dos valores inseridos: " + sum);
        System.out.println("Média dos valores inseridos: " + average);


        scan.close();
    }
}
