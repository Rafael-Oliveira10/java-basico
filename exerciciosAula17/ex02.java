package exerciciosAula17;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameUser;
        String password;
        boolean validPassword = false;

        do {
            System.out.println("Insira seu nome de usuario: ");
            nameUser = scan.next();

            System.out.println("Insira sua senha: ");
            password = scan.next();

            if (nameUser.equalsIgnoreCase(password)){
                System.out.println("Não são permitidas senhas iguais ao nome de usuário!");
            }else {
                validPassword = true;
                System.out.println("Usuario e senha cadastrado com sucesso!");
            }
        } while(!validPassword);
    }
}
