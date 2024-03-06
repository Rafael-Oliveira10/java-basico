package exerciciosAula15;
//exercicio para verificar o tipo de triangulo
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o lado 1: ");
        int lado1 = scan.nextInt();

        System.out.println("Insira o lado 2: ");
        int lado2 = scan.nextInt();

        System.out.println("Insira o lado 3: ");
        int lado3 = scan.nextInt();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado3 + lado2 > lado1) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triângulo escaleno");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3 ){
                System.out.println("Triângulo isóceles");
            }
        } else {
            System.out.println("Não forma um triangulo!");
        }
    }
}
