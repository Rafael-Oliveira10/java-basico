package exerciciosAula20;
/*Semelhante ao exercicio anterior, porém dessa vez utilizamos uma matriz tridimensional
para criar nossa agenda, agora contendo o campo de mês. */
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //trabalhando com matriz de Strings
        String[][][] compromissos = new String[12][31][8];

        boolean exit = false;
        byte option;
        while (!exit) {
            System.out.println("Digite 1 para adicionar compromisso. ");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            option = scan.nextByte();

            if (option == 1) { //adicionando compromisso

                boolean validMonth = false;
                int month = 0;
                while (!validMonth) {
                    System.out.println("Mês: ");
                    month = scan.nextInt();
                    if (month > 0 && month <= 12) {
                        validMonth = true;
                    } else {
                        System.out.println("Mês inválido! \n" + "Digite novamente.");
                    }
                }

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
                    if (hour >= 0 && hour <= 8) {
                        validTime = true;
                    } else {
                        System.out.println("Hora inválida! \n" + "Digite novamente.");
                    }
                }
                //day--;
                System.out.println("Compromisso: ");
                compromissos[--month][--day][hour] = scan.next();

            } else if (option == 2) { // verificar compromisso
                //Mes
                boolean validMonth = false;
                int month = 0;
                while (!validMonth) {
                    System.out.println("Mês: ");
                    month = scan.nextInt();
                    if (month > 0 && month <= 12) {
                        validMonth = true;
                    } else {
                        System.out.println("Mês inválido! \n" + "Digite novamente.");
                    }
                }
                // Dia
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
                //Hora
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
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[--month][--day][hour]);
            } else if (option == 0) {
                exit = true;
            } else {
                System.out.println("Opção inválida!\n" + "Digite novamente.");
            }
        }
        scan.close();
    }
}
