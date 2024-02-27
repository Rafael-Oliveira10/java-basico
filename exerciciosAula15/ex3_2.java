//Estou replicando o mesmo programinha para fixar o conteudo
// Esse é o terceiro

package exerciciosAula15;
import java.util.Scanner;
public class ex3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Selecione seu sexo:
                M - Masculino
                F - Feminino""");
        char userGender = scan.next().charAt(0);


        if(userGender == 'M'){
            System.out.println("Sexo selecionado: Masculino");
        } else if(userGender == 'F'){
            System.out.println("Sexo selecionado: Feminino");
        }else {
            System.out.println("Sexo selecionado: INVÁLIDO");
        }
            scan.close();
    }
}
