package exerciciosAula17;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Insira seu nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValidas = true;
            } else {
                System.out.println("Nome precisa no minimo de 3 caracteres.");
            }
        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Insira sua idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 100) {
                infoValidas = true;
            } else {
                System.out.println("Idade entre 0 e 100 anos.");
            }
        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Insira seu salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValidas = true;
            } else {
                System.out.println("Seu salário precisa ser maior que 0 reais.");
            }
        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Qual o seu sexo? ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValidas = true;
            } else {
                System.out.println("Sexo precisa ser 'F' ou 'M' ");
            }
        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Qual o seu estado Civil? ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")) {
                infoValidas = true;
            } else {
                System.out.println("Seu estado civil deve ser: 'S', 'C', 'V' ou 'D'");
            }
        } while (!infoValidas);

        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scan.close();
    }
}
