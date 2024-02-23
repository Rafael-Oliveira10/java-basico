package aula10;

public class Variaveis {
    public static void main(String[] args) {

        /*Convenção Java */
        int idade = 27;
        String nome = "Rafael";
        String nomeDoMeuCachorro = "Pluto";
        String ano2024;

        /*Aceito, porém não utilizado */
        int _idade;
        int $idade;
        

        /*Não é convenção Java */
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 28;

        System.out.println("idade = " + idade);
        System.out.println("nome = " + nome);

        /*Má prática */
        int a = 10;
        String b = "Rafael";

    }
}