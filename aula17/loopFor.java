package aula17;

public class loopFor {
    public static void main(String[] args) {

        //As variaveis criadas dentro do bloco for
        // estão dentro do escopo somente do bloco for
        for (int i=0; i < 5; i++){ //incremento
            System.out.println("i tem valor : " + i);
        }
        for (int i=5; i > 0; i--){ //decremento
            System.out.println("i tem valor : " + i);
        }
        // iniciando mais de uma variável dentro do for
        for (int i=0, j=10; i < j; i++, j--){
            System.out.println("i = " +i + "; j = " + j);
        }

        //partes ausentes dentro do for
        int count = 0;
        for (; count < 10 ; ){
            System.out.println("Valor de count " +count);
            count += 2;
        }
        //outra maneira de fazer, com todas partes inseridas dentro do for
        for (int cont = 0; cont < 10; cont +=2){
            System.out.println("Valor de cont " +cont);
            // mesmo resultado
        }
    }
}
