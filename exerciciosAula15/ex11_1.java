//mais uma vez para fixar o conteudo referente ao exercicio 11
package exerciciosAula15;
import java.util.Scanner;
public class ex11_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu salário atual para calcular o seu aumento: ");
        double salario = scan.nextDouble();

        double porcentagem = 0;

        if(salario <= 280){
            porcentagem = 20;
        } else if(salario >= 280 && salario < 700){
            porcentagem = 15;
        } else if(salario >= 700 && salario < 1500){
            porcentagem = 10;
        }  else if(salario >= 1500){
            porcentagem = 5;
        }
        double ajuste = (salario / 100) * porcentagem;
        double salarioAjustado = salario + ajuste;

        System.out.println("Salario atual " + salario);
        System.out.println("Percentual aplicado " + porcentagem);
        System.out.println("Valor do aumento " + ajuste);
        System.out.println("Salario após o reajuste " + salarioAjustado);

    }
}
