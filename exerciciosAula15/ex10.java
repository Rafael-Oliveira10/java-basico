package exerciciosAula15;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("""
                Em qual turno você estuda?
                M - Matutino
                V - Vespertino
                N - Noturno""");
        String turno = scan.next();

        //Pode ser feito utilizando o switch também
        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Turno inválido!");
        }
        scan.close();
    }
}
