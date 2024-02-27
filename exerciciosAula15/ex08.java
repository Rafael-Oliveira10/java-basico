package exerciciosAula15;
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do chocolate Nescle");
        int nescle = scan.nextInt();

        System.out.println("Qual o valor do chocolate Lacto");
        int lacto = scan.nextInt();

        System.out.println("Qual o valor do chocolate Liditi");
        int liditi = scan.nextInt();

        if(nescle <= lacto && nescle <= liditi){
            System.out.println("Nescle é o chocolate mais barato");
        }else if (lacto <= nescle && lacto <= liditi) {
            System.out.println("Lacto é o chocolate mais barato");
        }else if (liditi <= nescle && liditi <= lacto) {
            System.out.println("Liditi é o chocolate mais barato");
        }
        scan.close();
    }
}
