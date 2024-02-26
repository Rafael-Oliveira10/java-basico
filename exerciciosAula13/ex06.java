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

        //double area = Math.PI * Math.pow(raio, 2);
        //O resultado apresentado acima é o mesmo do código que eu fiz anteriormente.

        //O mesmo calculo acima, pode ser feito utilizando a classe Math
        // por motivos de aprendizado eu prefiri fazer na unha dessa vez
        // porém vou deixar anotado acima para eventuais consultas


        System.out.println("A area do circulo é: " +area +"mm");
    }
}
