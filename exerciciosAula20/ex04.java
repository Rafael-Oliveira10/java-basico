package exerciciosAula20;
//Agendinha
/*31 dias e 24 horas. Ela serve para marcar um compromisso, colocando as posições da matriz
que você 'salvou' as informações, você consegue verificar o compromisso agendado. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //trabalhando com matriz de Strings
        String[][] compromissos = new String[31][24];

        boolean exit = false;
        byte option;
        while (!exit) {
            System.out.println("Digite 1 para adicionar compromisso. ");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            option = scan.nextByte();

            if (option == 1) { //adicionando compromisso

                boolean validDay = false;
                int day = 0;
                while (!validDay) {
                    System.out.println("Dia do mês: ");
                    day = scan.nextInt();
                    if (day > 0 && day <= 31) {
                        validDay = true;
                    } else {
                        System.out.println("Dia inválido! \n" + "Digite novamente.");
                    }
                }

                boolean validTime = false;
                int hour = 0;
                while (!validTime) {
                    System.out.println("Hora do compromisso: ");
                    hour = scan.nextInt();
                    if (hour >= 0 && hour <= 24) {
                        validTime = true;
                    } else {
                        System.out.println("Hora inválida! \n" + "Digite novamente.");
                    }
                }
                //day--;
                System.out.println("Compromisso: ");
                compromissos[--day][hour] = scan.next();

            } else if (option == 2) { // verificar compromisso
                boolean validDay = false;
                int day = 0;
                while (!validDay) {
                    System.out.println("Dia do mês: ");
                    day = scan.nextInt();
                    if (day > 0 && day <= 31) {
                        validDay = true;
                    } else {
                        System.out.println("Dia inválido! \n" + "Digite novamente.");
                    }
                }

                boolean validTime = false;
                int hour = 0;
                while (!validTime) {
                    System.out.println("Hora do compromisso: ");
                    hour = scan.nextInt();
                    if (hour >= 0 && hour <= 24) {
                        validTime = true;
                    } else {
                        System.out.println("Hora inválida! \n" + "Digite novamente.");
                    }
                }
                day--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[day][hour]);
            } else if (option == 0) {
                exit = true;
            } else {
                System.out.println("Opção inválida!\n" + "Digite novamente.");
            }
        }
        scan.close();
    }
}
