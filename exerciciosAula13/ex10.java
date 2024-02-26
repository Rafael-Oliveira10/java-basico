package exerciciosAula13;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura de hoje em graus Celsius?");

        int celsius = sc.nextInt();
        double fahrenheit = (double) celsius * 1.8 +32;

        System.out.println("A temperatura de hoje em Fahrenheit é: " +fahrenheit);
    }
}
