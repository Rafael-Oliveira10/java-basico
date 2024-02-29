package exerciciosAula15;
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora de trabalho?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou esse mês?");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double ImpostoRenda = 0;



        if (salarioBruto <= 900){
           ImpostoRenda = 0;
        } else if(salarioBruto > 900 && salarioBruto <= 1500){
            ImpostoRenda = 5;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){
            ImpostoRenda = 10;
        } else if(salarioBruto > 2500){
            ImpostoRenda = 20;
        }

        /*consegui arrumar o bug do totalDescontos após conseguir arrumar o problema da variavel
          fora do escopo. */
        double descontoIr = (salarioBruto / 100) * ImpostoRenda;
        double totalDescontos = inss + descontoIr;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Seu salario bruto foi de: " +salarioBruto);
        System.out.println("Seu Desconto de Imposto de renda foi de: " + descontoIr);
        System.out.println("Seu Desconto de INSS foi de: " +inss);
        System.out.println("O depósito de FGTS desse mes foi de: " +fgts);
        System.out.println("Total de descontos : " +totalDescontos);
        System.out.println("Seu salario liquido : " +salarioLiquido);

        scan.close();
    }
}
