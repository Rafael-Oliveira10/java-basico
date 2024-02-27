package exerciciosAula15;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Anote seu primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Anote seu segundo número");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro numero inserido é maior: " +num1);
        } else{
            System.out.println("O segundo numero inserido é maior: " +num2);

        }
        scan.close();
    }
}
