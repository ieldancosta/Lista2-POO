package Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CadastroFilme {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);

        List<Ator> atores = new ArrayList<Ator>();
        List<Ator> atrizes = new ArrayList<Ator>();
        List<Diretor> diretores = new ArrayList<Diretor>();
        List<Filme> filmes = new ArrayList<Filme>();


        Ator bradPitt = new Ator("Brad Pitt", 7, 60);
        Ator angelina = new Ator("Angeline Jolie", 2, 49);

        atores.add(bradPitt);
        atrizes.add(angelina);

        Diretor doug = new Diretor("Doug Lima", false);

        Filme srSraSmith = new Filme ("Sr. e Sra. Smith", bradPitt,
                angelina, doug);

        doug.setPrincipalFilme(srSraSmith);

        diretores.add(doug);
        filmes.add(srSraSmith);

        atores.add(new Ator("Bruce Lee", 0, 31));

        int continuar;
        do {
            System.out.println("Cadastro de Atores: ");
            System.out.println("Informe o nome do Ator: ");
            String nome = entrada.nextLine();

            System.out.println("Informe a idade do " + nome + ": ");
            int idade = entrada.nextInt();

            System.out.println("Informe a quantidade de oscars vencidos pelo " + nome +": " );
            int qntOscars = entrada.nextInt();

            atores.add(new Ator(nome, qntOscars, idade));

            System.out.println("Deseja continuar adicionando atores? (1- Sim; 0-Não): ");
            continuar = entrada.nextInt();

            entrada.nextLine();

        }while(continuar == 1);

        do {
            System.out.println("Cadastro de Atrizes: ");
            System.out.println("Informe o nome da Atriz: ");
            String nome = entrada.nextLine();

            System.out.println("Informe a idade da " + nome + ": ");
            int idade = entrada.nextInt();

            System.out.println("Informe a quantidade de oscars vencidos pela " + nome +": " );
            int qntOscars = entrada.nextInt();

            atrizes.add(new Ator(nome, qntOscars, idade));

            System.out.println("Deseja continuar adicionando atrizes? (1- Sim; 0-Não): ");
            continuar = entrada.nextInt();

            entrada.nextLine();

        }while(continuar == 1);

        do {
            System.out.println("Cadastro de Diretores: ");
            System.out.println("Informe o nome da Diretor: ");
            String nome = entrada.nextLine();

            System.out.println("Informe se o " + nome + " já venceu algum Oscar (1- Sim; 0- Não): ");
            int oscar = entrada.nextInt();

            boolean venceuOscar = false;
            if(oscar == 1) {
                venceuOscar = true;
            }

            diretores.add(new Diretor(nome, venceuOscar));

            System.out.println("Deseja continuar adicionando diretores? (1- Sim; 0-Não): ");
            continuar = entrada.nextInt();

            entrada.nextLine();

        }while(continuar == 1);

        do {
            System.out.println("Cadastro de Filmes: ");
            System.out.println("Informe o título do Filme: ");
            String titulo = entrada.nextLine();

            int i = 0;
            for(Ator ator : atores) {
                System.out.println(i + " - " + ator.getNome());
                i++;
            }
            System.out.println("Qual o ID do Ator Principal: ");
            int idAtor = entrada.nextInt();

            i = 0;
            for(Ator ator : atrizes) {
                System.out.println(i + " - " + ator.getNome());
                i++;
            }
            System.out.println("Qual o ID da Atriz Principal: ");
            int idAtriz = entrada.nextInt();

            i = 0;
            for(Diretor diretor : diretores) {
                System.out.println(i + " - " + diretor.getNome());
            }
            System.out.println("Qual o ID do Diretor do Filme: ");
            int idDiretor = entrada.nextInt();

            Filme filmeParaAdicionar = new Filme(titulo, atores.get(idAtor),
                    atrizes.get(idAtriz), diretores.get(idDiretor));

            if(buscaFilme(filmeParaAdicionar, filmes) == true) {
                filmes.add(filmeParaAdicionar);
            }
            else {
                System.out.println("O filme já existe no catálogo de filmes.");
            }

            System.out.println("Deseja continuar adicionando filmes? (1- Sim; 0-Não): ");
            continuar = entrada.nextInt();

            entrada.nextLine();

        }while(continuar == 1);

    }

    private static boolean buscaFilme(Filme filme, List<Filme> filmes) {
        for (Filme f : filmes ) {
            if(f.getTitulo().equals(filme.getTitulo())) {
                return false;

            }
        }

        return true;
    }

}
