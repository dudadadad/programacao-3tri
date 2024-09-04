package sistemaBiblioteca;

public class Jornal extends Publicacao {

    public Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("jornal '" + titulo + "' emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("jornal '" + titulo + "' devolvido.");
    }
}

