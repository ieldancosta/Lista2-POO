package Ex2;

public class Ator {

    private String nome;
    private int nOscars;
    private int idade;

    public Ator(String nome, int nOscars, int idade) {
        super();
        this.nome = nome;
        this.nOscars = nOscars;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ator [nome=" + nome + ", nOscars=" + nOscars + ", idade=" + idade + "]";
    }

    public String getNome() {
        return nome;
    }
    public int getnOscars() {
        return nOscars;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setnOscars(int nOscars) {
        this.nOscars = nOscars;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }



}
