//Estou replicando o mesmo programinha para fixar o conteudo
// Esse é o segundo

package exerciciosAula15;
import java.util.Scanner;
public class ex3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Qual o seu sexo?
                M - Masculino
                F - Feminino""");
        char userGender = scan.next().charAt(0);
        //String input = scan.next();
        //--- Pode ser feito desse jeito também
        // if (input.equalsIgnoreCase("f"))
        if(userGender == 'M'){
            System.out.println("O seu sexo é: Masculino");
        } else if (userGender == 'F'){
            System.out.println("O seu sexo é: Feminino");
        } else {
            System.out.println("Sexo INVÁLIDO!");
        }

    }
}
