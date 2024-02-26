package exerciciosAula13;

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o seu peso ideal?");
        System.out.println("Primeiro, precisamos saber seu sexo?");

        boolean homem = sc.nextBoolean();
        boolean mulher = sc.nextBoolean();

        System.out.println("Agora precisamos saber qual a sua altura?");

        double alturaHomem = sc.nextDouble();
        double baseHomem = 72.7;
        int baseHomem2 = 58;

        double alturaMulher = sc.nextDouble();
        double baseMulher = 62.1;
        double baseMulher2 = 44.7;

        //Está funcional, mas não do jeito que eu queria.
        //Gostaria que a seleção de sexo, fosse somente uma opção
        //de 'homem' ou 'mulher'  e não 'true' ou 'false' e a inserção da altura também
        //Mas em breve volto para corrigir.
        if (homem) {

            double pesoIdealHomem = (baseHomem * alturaHomem) - baseHomem2;

            System.out.println("O peso ideal do homem é: " + pesoIdealHomem);

        } else {

            double pesoIdealMulher = (baseMulher * alturaMulher) - baseMulher2;

            System.out.println("O peso ideal da mulher é:"  + pesoIdealMulher);
        }
    }
}
