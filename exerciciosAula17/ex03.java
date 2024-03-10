package exerciciosAula17;
//Coleta alguns dados do usuário e os apresenta no final
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean validInfo = false;
        int age;
        double wage;
        String name;
        String gender;
        String maritalStatus;

        do {
            System.out.println("Qual o seu nome?");
            name = scan.next();

            if (name.length() >= 3) {
                validInfo = true;
            } else {
                System.out.println("Nome precisa de no minímo 3 caracteres!");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.println("Qual a sua idade?");
            age = scan.nextInt();

            if (age > 0 && age < 150) {
                validInfo = true;
            } else {
                System.out.println("Idade inválida! Precisa ser entre 0 e 150 anos.");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.println("Qual a sua renda?");
            wage = scan.nextInt();

            if (wage > 0) {
                validInfo = true;
            } else {
                System.out.println("Declaração de renda inválida! Renda precisa ser maior que 0.");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.println("Qual o seu sexo?");
            gender = scan.next();

            if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")) {
                validInfo = true;
            } else {
                System.out.println("Declaração de sexo inválida! Precisa ser declarada com 'F' ou" +
                        " 'M'");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.println("Qual o seu estado civil ('S', 'C', 'V' ou 'D')?");
            maritalStatus = scan.next();

            if (maritalStatus.equalsIgnoreCase("s")
                    || maritalStatus.equalsIgnoreCase("c")
                    || maritalStatus.equalsIgnoreCase("v")
                    || maritalStatus.equalsIgnoreCase("d")) {
                validInfo = true;
            } else {
                System.out.println("Seu estado civil deve ser 'S', 'C', 'V' ou 'D'!");
            }
        } while (!validInfo);

        System.out.println("Os dados coletados foram: \n");
        System.out.println("Nome: " +name);
        System.out.println("Idade: " +age);
        System.out.println("Salário: " +wage);
        System.out.println("Sexo: " +gender);
        System.out.println("Estado civil: " +maritalStatus);

        scan.close();
    }
}
