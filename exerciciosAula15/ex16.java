package exerciciosAula15;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor de a: ");
        int a = scan.nextInt();


        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau!");
        } else {
            System.out.println("Insira o valor de b: ");
            int b = scan.nextInt();

            System.out.println("Insira o valor de c");
            int c = scan.nextInt();

            double delta = (b*b) - (4*a*c);
            if(delta < 0){
                System.out.println("Delta negativo");
            }else{

                System.out.println("delta: " +delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
                //Baskara :´)
                System.out.println("X1 = " +x1);
                System.out.println("X2 = " +x2);
            }
        }
    }
}
