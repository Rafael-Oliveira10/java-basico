package exerciciosAula27;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Insira o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Insira o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Insira o número da matricula: ");
        aluno.matricula = scan.next();

        //aluno.nomeDisciplinas = new String[3]; //ja foi declarado na class Aluno
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Insira o nome da disciplina: " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.print("Insira a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Foi reprovado");
            }
        }

        scan.close();
    }
}
