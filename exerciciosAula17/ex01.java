package exerciciosAula17;

import java.util.Scanner;

//Verificando uma nota de 0 a 10
public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validNote = false;

        do {
            System.out.println("Insira sua nota: ");
            double note = scan.nextDouble();
            if (note >= 0 && note <= 10) {
                validNote = true;
                System.out.println("Sua nota bimestral foi: " + note);
            } else {
                System.out.println("Nota inválida, insira uma nota de 1 a 10! \n");
            }
        } while (!validNote);
        scan.close();
    }
}
