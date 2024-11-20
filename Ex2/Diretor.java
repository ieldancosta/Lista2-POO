package Ex2;

public class Diretor {

    private String nome;
    private Boolean ganhadorOscar;
    private Filme principalFilme;

    public Diretor (String nome, Boolean ganhadorOscar) {
        this.nome = nome;
        this.ganhadorOscar = ganhadorOscar;
    }

    public String toString() {
        return "Nome: " + this.nome +
                "\nPrincipal Filme: " + this.principalFilme.getTitulo();
    }

    public String getNome() {
        return nome;
    }
    public Boolean getGanhadorOscar() {
        return ganhadorOscar;
    }
    public Filme getPrincipalFilme() {
        return principalFilme;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGanhadorOscar(Boolean ganhadorOscar) {
        this.ganhadorOscar = ganhadorOscar;
    }
    public void setPrincipalFilme(Filme principalFilme) {
        this.principalFilme = principalFilme;
    }




}
