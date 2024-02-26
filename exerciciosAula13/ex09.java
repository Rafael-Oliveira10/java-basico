package exerciciosAula13;
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual a temperatura de hoje em Farenheit?");

        int fahrenheit = sc.nextInt() -32;
        double baseConversao = 1.8;
        //eliminando 'magic number', criando uma variavel e dando sentido ao 1.8.
        double celsius = fahrenheit / baseConversao;

        System.out.println("A temperatura de hoje em Celsius, é:" +celsius);
    }
}
