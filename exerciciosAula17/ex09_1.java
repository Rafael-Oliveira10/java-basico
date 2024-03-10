package exerciciosAula17;

public class ex09_1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i+=2){
            System.out.print(i + " ");
        }

        System.out.println("\n");
        // OU
        for(int i = 0; i <=50; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
