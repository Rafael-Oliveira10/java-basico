package exerciciosAula17_1;

//Mostra os valores impares de 1 a 50
public class ex09 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }

        //        OU
        System.out.println("\n");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
