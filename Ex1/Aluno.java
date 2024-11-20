package Ex1;

public class Aluno
{
    // Construtor
    public Aluno(int matricula, String nome, double notaBimestre1, double notaBimestre2)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
    }


    // Propriedades
    private int matricula;
    private String nome;
    private double notaBimestre1, notaBimestre2;

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getNotaBimestre1()
    {
        return notaBimestre1;
    }

    public void setNotaBimestre1(double notaBimestre1)
    {
        this.notaBimestre1 = notaBimestre1;
    }

    public double getNotaBimestre2()
    {
        return notaBimestre2;
    }

    public void setNotaBimestre2(double notaBimestre2)
    {
        this.notaBimestre2 = notaBimestre2;
    }
}
