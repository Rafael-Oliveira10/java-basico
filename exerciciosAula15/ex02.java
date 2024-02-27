package exerciciosAula15;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um valor positivo ou negativo a seguir: ");
        int value = scan.nextInt();

        if(value > 0){
            System.out.println("Esse valor é positivo: " +value);
        } else {
            System.out.println("Esse valor é negativo: " +value);
        }
        scan.close();
    }
}