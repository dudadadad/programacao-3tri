package sistemaBiblioteca;

public abstract class Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void emprestar();

    public abstract void devolver();
}
