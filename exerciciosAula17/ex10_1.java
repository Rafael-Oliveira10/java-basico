package exerciciosAula17;

import java.util.Scanner;

public class ex10_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira o primeiro número: ");
        int num2 = scan.nextInt();

        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }
        scan.close();
    }
}
