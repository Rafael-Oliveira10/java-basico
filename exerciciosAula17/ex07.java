package exerciciosAula17;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for(int i=0; i < 5; i++){
            System.out.println("Entre com um número");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                System.out.println("O maior numero foi atualizado" + maior);
            }//Identifica o maior numero digitado pelo usuario
        }

        System.out.println("O maior numero digitado foi: " + maior);
        scan.close();
    }
}
