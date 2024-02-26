package exerciciosAula13;
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu rendimento por hora em reais?");
        double rendimentoHora = sc.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mes? ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = horasTrabalhadas * rendimentoHora;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;

        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.println("O salario bruto desse mes foi de: " +salarioBruto);
        System.out.println("O total de desconto, referente ao inss foi: " +inss);
        System.out.println("O total de desconto, referente ao sindicato foi: " +sindicato);
        System.out.println("O total de descontos referente ao ir foi: " +ir);
        System.out.println("O total de descontos desse mes foi de: " +totalDescontos);
        System.out.println("O salario liquido desse mes foi de: " +salarioLiquido);



    }
}
