package exerciciosAula15;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual é o seu nome? ");
        String name;
        name = scan.nextLine();
        System.out.println("Olá, " +name + " insira suas notas, para calcular sua média e saber " +
                "se foi aprovado");

        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double grade3 = scan.nextDouble();
        double grade4 = scan.nextDouble();

        double finalGrade = (grade1 + grade2 + grade3 + grade4) / 4;

        if(finalGrade == 10){
            System.out.println("PARABÉNS " +name + " você foi aprovado com distinção!");
        }else if(finalGrade >= 6){
            System.out.println("PARABÉNS " +name + " você foi aprovado!");
        }else{
        System.out.println("Infelizmente " +name + " você foi reprovado!");
        }
        scan.close();
    }
}
