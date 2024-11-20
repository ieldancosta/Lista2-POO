package Ex2;

public class Filme {

    private String titulo;
    private Ator atorPrincipal;
    private Ator atrizPrincipal;
    private Diretor diretor;

    public Filme(String titulo, Ator atorPrincipal, Ator atrizPrincipal, Diretor diretor) {
        super();
        this.titulo = titulo;
        this.atorPrincipal = atorPrincipal;
        this.atrizPrincipal = atrizPrincipal;
        this.diretor = diretor;
    }

    public String toString() {
        return "Título: " + this.titulo +
                "\nDiretor: " + this.diretor.getNome() +
                "\nAtor Principal: " + this.atorPrincipal.getNome() +
                "\nAtriz Principal: " + this.atrizPrincipal.getNome();

    }

    public String getTitulo() {
        return titulo;
    }
    public Ator getAtorPrincipal() {
        return atorPrincipal;
    }
    public Ator getAtrizPrincipal() {
        return atrizPrincipal;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAtorPrincipal(Ator atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }
    public void setAtrizPrincipal(Ator atrizPrincipal) {
        this.atrizPrincipal = atrizPrincipal;
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }




}

