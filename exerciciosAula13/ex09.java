package exerciciosAula13;
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual a temperatura de hoje em Farenheit?");

        int fahrenheit = sc.nextInt() -32;
        double celsius = fahrenheit / 1.8;

        System.out.println("A temperatura de hoje em Celsius, é:" +celsius);
    }
}
