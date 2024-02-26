package exerciciosAula13;
import java.util.Scanner;
public class ex15 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho do seu arquivo em MB: ");
        double tamArquivo = sc.nextDouble();

        System.out.println("Qual a velocidade de internet em Mb?");
        double velInternet = sc.nextDouble();

        double tempo =  tamArquivo / velInternet;

        System.out.println("O tempo médio de download do seu arquivo é de: " +tempo);


    }
}
