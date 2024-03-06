package exerciciosAula15;
//Verifica uma data válida
//Ainda não ficou do jeito que eu queria, no futuro volto para arrumar
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um dia de 1 a 31: ");
        int dia = scan.nextInt();

        System.out.println("Insira um mês de 1 a 12: ");
        int mes = scan.nextInt();

        System.out.println("Insira um ano: ");
        int ano = scan.nextInt();

        if (dia < 1 && dia > 32) {
        } else if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido, insira um dia de 1 a 31");

            switch (mes) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Fev");
                    break;
                case 3:
                    System.out.println("Mar");
                    break;
                case 4:
                    System.out.println("Abr");
                    break;
                case 5:
                    System.out.println("Mai");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jul");
                    break;
                case 8:
                    System.out.println("Ago");
                    break;
                case 9:
                    System.out.println("Set");
                    break;
                case 10:
                    System.out.println("Out");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dez");
                    break;
                default:
                    System.out.println("Mes inválido, insira um mês válido de 1 a 12!!");
            }

            if (ano < -4000 || ano > 4000) {
                System.out.println("Você não está querendo ir muito longe?");
            }
        }
        System.out.println(+dia + "/" + mes + "/" + ano);
        System.out.println("Esta é uma data válida!");

    }
}
