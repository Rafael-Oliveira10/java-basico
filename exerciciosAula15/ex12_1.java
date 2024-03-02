//repetindo o exercicio 12
package exerciciosAula15;
import java.util.Scanner;
public class ex12_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor hora de trabalho: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double impostoRenda = 0;

        if (salarioBruto < 900) {
            impostoRenda = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            impostoRenda = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            impostoRenda = 10;
        } else if (salarioBruto > 2500) {
            impostoRenda = 20;
        }

        double descontoIr = (salarioBruto / 100) * impostoRenda;
        double totalDescontos = inss + descontoIr;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto Ir: " + descontoIr);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Depósito FGTS: " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário liquido: " + salarioLiquido);
        scan.close();
    }
}
