package exerciciosAula13;

import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio do círculo em mm: ");

        //Quanto mais algarismos o numero pi tiver, o resultado pode varias
        //Aproveitei para testar as variações, e o resultado mais fiel é 201,06
        double raio = sc.nextDouble();
        double raio2 = raio * raio;
        double pi = 3.14;
        double area = pi * raio2;

        System.out.println("A area do circulo é: " +area +"mm");
    }
}
