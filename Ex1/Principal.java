package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        // Instâncias
        Scanner sc = new Scanner(System.in);


        // Variáveis
        String continuar;
        int matricula;
        String nome;
        double notaBimestre1;
        double notaBimestre2;

        List<Aluno> listaAlunos = new ArrayList<>();


        // Entrada
        do
        {
            System.out.print("Insira o nome do aluno: ");
            nome = sc.nextLine();

            do
            {
                System.out.print("Insira o número de matrícula: ");
                matricula = sc.nextInt();

                if (matricula < 0)
                {
                    System.out.println("Número de matrícula inválido, ele deve ser inteiro e positivo!\n");
                }
            }
            while (matricula < 0);

            do
            {
                System.out.print("Insira a nota do primeiro bimestre: ");
                notaBimestre1 = sc.nextDouble();

                if (notaBimestre1 < 0 || notaBimestre1 > 10)
                {
                    System.out.println("Nota inválida, ele deve estar entre 0 e 10");
                }
            }
            while (notaBimestre1 < 0 || notaBimestre1 > 10);

            do
            {
                System.out.print("Insira a nota do segundo bimestre: ");
                notaBimestre2 = sc.nextDouble();

                if (notaBimestre2 < 0 || notaBimestre2 > 10)
                {
                    System.out.println("Nota inválida, ele deve estar entre 0 e 10");
                }
            }
            while (notaBimestre2 < 0 || notaBimestre2 > 10);

            // Resetar buffer
            sc.nextLine();

            listaAlunos.add(new Aluno(matricula, nome, notaBimestre1, notaBimestre2));

            System.out.println("Você deseja continuar e adicionar um novo aluno? (sim / não)");
            continuar = sc.nextLine().toLowerCase().trim();
            System.out.print("\n");
        }
        while (continuar.equals("s") || continuar.equals("sim"));

        for (Aluno aluno : listaAlunos)
        {
            System.out.println(aluno.getNome() + "\nNota 1: " + aluno.getNotaBimestre1() + "\nNota 2: " + aluno.getNotaBimestre2() + "\nMédia: " + (aluno.getNotaBimestre1() + aluno.getNotaBimestre2()) / 2);
            System.out.println((aluno.getNotaBimestre1() + aluno.getNotaBimestre2()) / 2 >= 6 ? "Aprovado(a)\n" : "Reprovado(a)\n");
        }
    }
}
