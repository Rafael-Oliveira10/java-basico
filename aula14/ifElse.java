package aula14;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Qual a sua idade?");

        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
*/
        System.out.println("Qual o valor do chocolate?");
        double valor = sc.nextDouble();

        if(valor <= 10){
            System.out.println("Preco bom");
        } else if(valor <= 15){
            System.out.println("Pedir desconto, se não tiver, tá caro");
        } else if(valor <= 17){
            System.out.println("Pesquisar outras lojas");
        } else {
            System.out.println("Muito caro! Mais de 17 conto no chocolatim");
        }
    }
}
