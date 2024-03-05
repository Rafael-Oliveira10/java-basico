package aula19;

public class Arrays {
    public static void main(String[] args) {

       /* método ineficaz
        double tempDia001 = ;
        double tempDia002 = ;
        double tempDia003 = ;
        double tempDia004 = ;
        double tempDia005 = ; e mais 360 variaveis
        */

        //boa pratica
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        //exibe a quantidade de intens do array
        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Endereço de memoria do array: " + temperaturas);

        //info mais completas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }
        //somente valor
        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }
}
