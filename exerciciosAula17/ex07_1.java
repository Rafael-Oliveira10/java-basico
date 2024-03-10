package exerciciosAula17;

import java.util.Scanner;

public class ex07_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O maior número foi atualizado: " + maior);
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        scan.close();
    }
}
