package exerciciosAula15;
//Verifica se um número é par ou ímpar
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");

        for (int num = scan.nextInt(); ; ) {
            if (num % 2 == 0) {
                System.out.println("Esse número é par!");
            } else {
                System.out.println("Esse número é impar");
                break;
            }
        }
    }
}
