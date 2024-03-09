package exerciciosAula17_1;
// Le dois numeros, mostra todos os numeros no intervalo e os soma depois

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira o primeiro número: ");
        int num2 = scan.nextInt();

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Soma: " + sum);

        scan.close();
    }
}
