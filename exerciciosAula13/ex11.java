package exerciciosAula13;

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero inteiro");
        int inteiro1 = sc.nextInt();

        System.out.println("Insira o segundo numero inteiro");
        int inteiro2 = sc.nextInt();

        System.out.println("Insira um numero real");
        double numReal = sc.nextDouble();

        double resultado1 = (double) (inteiro1 * 2) * (inteiro2 / 2);
        double resultado2 = (double) inteiro1 * 3 + numReal;
        double resultado3 = Math.pow(numReal, 3);

        System.out.println("O produto do dobro do primeiro com a metade do segundo valor é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro numero é: " +resultado2);
        System.out.println("O terceiro valor elevado ao cubo é: " +resultado3);

    }
}
