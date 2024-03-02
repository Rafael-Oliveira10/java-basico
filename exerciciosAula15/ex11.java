package exerciciosAula15;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu salário atual?");
        double income = scan.nextDouble();
        int percentage = 0;

        if(income <= 280){
            percentage = 20;
        } else if(income > 280 && income < 700){
            percentage = 15;
        } else if(income >= 700 && income < 1500){
            percentage = 10;
        } else if(income >= 1500){
            percentage = 5;
        }

        double increase = (income / 100) * percentage;
        double adjustedSalary = income + increase;

        System.out.println("Salário atual " +income);
        System.out.println("Percentual " +percentage);
        System.out.println("Aumento " +increase);
        System.out.println("Salário após o aumento " +adjustedSalary);
        scan.close();
    }
}
