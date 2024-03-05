package exerciciosAula17;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o numero base: ");
        int base = scan.nextInt();

        System.out.println("Insira a potencia: ");
        int pot = scan.nextInt();

        int resultado = base;

        for(int i=1; i<pot; i++){
            resultado *= base;
        }
        //Calculo de potencias
        System.out.println("Resultado: " + resultado);
        scan.close();
    }
}
