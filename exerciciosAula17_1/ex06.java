package exerciciosAula17_1;
//Contador de 1 a 20 usando loop for

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //imprime com quebra de linha
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        //imprime os 20 valores em uma linha
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
