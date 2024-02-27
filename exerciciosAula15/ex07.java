package exerciciosAula15;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro numero abaixo: ");
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo numero abaixo: ");
        int num2 = scan.nextInt();

        System.out.println("Insira o terceiro numero abaixo: ");
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("O primeiro numero é o maior: " +num1);
        }else if(num2 >= num1 && num2 >= num3) {
            System.out.println("O segundo numero é o maior: " + num2);
        }else if (num3 >= num1 && num3 >= num2){
            System.out.println("O terceiro numero é o maior: " + num3);
        }
        if(num1 <= num2 && num1 <= num3){
            System.out.println("O primeiro numero é o menor: " +num1);
        }else if(num2 <= num1 && num2 <= num3) {
            System.out.println("O segundo numero é o menor: " + num2);
        }else if (num3 <= num1 && num3 <= num2){
            System.out.println("O terceiro numero é o menor: " + num3);
        }
        scan.close();
    }
}
