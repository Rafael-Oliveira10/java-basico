package exerciciosAula13;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura de hoje em graus Celsius?");

        int baseCelsius = 32;
        int celsius = sc.nextInt();
        //eliminando 'magic number', criando uma variavel e dando sentido ao 1.8.
        double baseConversao = 1.8;
        double fahrenheit = (double) celsius * baseConversao +baseCelsius;

        System.out.println("A temperatura de hoje em Fahrenheit é: " +fahrenheit);
    }
}
