package exerciciosAula15;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Digite o seu sexo
                M - Masculino
                F - Feminino""");
        char userGender = scan.next().charAt(0);

        if(userGender == 'M'){
            System.out.println("Sexo escolhido: Masculino");
        } else if (userGender == 'F') {
            System.out.println("Sexo escolhido: Feminino");
        }else {
            System.out.println("Sexo INVÁLIDO");
        }
    }
}
