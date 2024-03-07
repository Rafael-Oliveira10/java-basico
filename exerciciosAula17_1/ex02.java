package exerciciosAula17_1;
//Registra um nome e uma senha, se os valores forem iguais
//Solicita novamente a inserção dos dados ao usuário
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password;
        String name;
        boolean validUser = false;

        do {
            System.out.println("Insira seu nome de usuário: ");
            name = scan.next();

            System.out.println("Crie uma nova senha: ");
            password = scan.next();

            if (name.equalsIgnoreCase(password)) {
                System.out.println("Senhas iguais ao login não são permitidas!");

            } else {
                validUser = true;
                System.out.println("Senha criada com sucesso!");
            }
        } while (!validUser);
        scan.close();
    }
}
