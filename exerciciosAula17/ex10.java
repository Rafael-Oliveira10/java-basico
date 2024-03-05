package exerciciosAula17;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scan.nextInt();
        //Mostra todos os numeros no intervalo em sequencia até o numero final
        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }
        scan.close();
    }
}
