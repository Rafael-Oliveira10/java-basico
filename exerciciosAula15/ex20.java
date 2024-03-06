package exerciciosAula15;
//Uma simples calculadora, que no final da operação informa se o numero é positivo ou negativo
//par ou ímpar
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com a operação (+ - / *): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = (double) num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida! ");
                valida = false;
        }

        if(valida){

            System.out.println("Resultado" +resultado);

            if(resultado >= 0){
                System.out.println("Resultado positivo!");
            }else{
                System.out.println("Resultado negativo!");
            }

            if(resultado % 2 == 0){
                System.out.println("resultado par!");
            }else {
                System.out.println("Resultado ímpar!");
            }

        }
    }
}
