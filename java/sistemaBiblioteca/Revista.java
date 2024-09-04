package sistemaBiblioteca;

public class Revista extends Publicacao implements Reservavel {

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("revista '" + titulo + "' emprestada.");
    }

    @Override
    public void devolver() {
        System.out.println("revista '" + titulo + "' devolvida.");
    }

    @Override
    public void reservar() {
        System.out.println("revista '" + titulo + "' reservada.");
    }
}

