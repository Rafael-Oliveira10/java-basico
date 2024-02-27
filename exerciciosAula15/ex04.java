package exerciciosAula15;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma letra do alfabeto");
            // String letra = scan.next();
        char vogal = scan.next().charAt(0);
            // if (letra.equalsIgnoreCase("a") e etc.
            //Pode ser feito desse jeito
        if (vogal == 'a') {
            System.out.println("É uma vogal!");
        } else if (vogal == 'e') {
            System.out.println("É uma vogal!");
        } else if (vogal == 'i') {
            System.out.println("É uma vogal!");
        } else if (vogal == 'o') {
            System.out.println("É uma vogal!");
        } else if (vogal == 'u') {
            System.out.println("É uma vogal!");
        }else {
            System.out.println("A letra inserida é uma consoante!");
        }
        //E também pode ser feito com switch
        /*switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("vogal"); break;
            default:System.out.println("consoante"); */
    }

}
