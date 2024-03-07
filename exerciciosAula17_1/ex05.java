package exerciciosAula17_1;
//Semelhante ao exercício anterios, de calcular o crescimento populacional
//Nessa versão podemos trabalhar inserindo os dados que temos sobre determinada cidade
//E não algo pré definido

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valid = false;
        int popA;
        int popB;
        double taxA;
        double taxB;

        do {
            System.out.println("Insira um número correspondente a população da sua cidade: ");
            popA = scan.nextInt();
            if (popA > 0) {
                valid = true;
            } else {
                System.out.println("Número inválido, insira um número maior que zero");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Insira um número correspondente a população da sua cidade: ");
            popB = scan.nextInt();
            if (popB > 0) {
                valid = true;
            } else {
                System.out.println("Número inválido, insira um número maior que zero");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Insira a taxa de crescimento correspondente a população da" +
                    "cidade: ");
            taxA = scan.nextDouble();
            if (taxA > 0) {
                valid = true;
            } else {
                System.out.println("Número inválido, insira um número maior que zero");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Insira a taxa de crescimento correspondente a população da" +
                    "cidade: ");
            taxB = scan.nextDouble();
            if (taxB > 0) {
                valid = true;
            } else {
                System.out.println("Número inválido, insira um número maior que zero");
            }
        } while (!valid);

        int anos = 0;

        while (popA < popB) {
            popA += (popA / 100) * taxA;
            popB += (popB / 100) * taxB;
            anos++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos " + anos);

        scan.close();
    }
}
