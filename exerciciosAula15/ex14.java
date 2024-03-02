package exerciciosAula15;
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua primeira nota parcial: ");
        double nota1 = scan.nextDouble();

        System.out.println("Insira sua segunda nota parcial: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito ="";

        if (media >= 9 && media <= 10){
            conceito = "A";
        }else if (media >= 7.5 && media < 9) {
            conceito = "B";
        }else if (media >= 6.0 && media < 7.5){
            conceito = "C";
        }else if (media >= 4.0 && media < 6.0){
            conceito = "D";
        }else if (media >= 0 && media < 4.0){
            conceito = "E";
        }

        System.out.println("Nota 1 = " +nota1);
        System.out.println("Nota 2 = " +nota2);
        System.out.println("Sua média foi: " +media);
        System.out.println("Conceito: " +conceito);

        switch(conceito){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            case "D":
            case "E": System.out.println("REPROVADO"); break;
        }
        scan.close();
    }
}
