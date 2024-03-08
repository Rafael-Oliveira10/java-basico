package exerciciosAula17_1;
//Verifica a espectativa de crescimento demográfico de duas cidades
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int popA = 80000;
        int popB = 200000;
        int years = 0;

        while(popA < popB){
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            years++;
        }

        System.out.println("População A " +popA);
        System.out.println("População B " +popB);
        System.out.println("Qtd de anos " +years);
    }
}
