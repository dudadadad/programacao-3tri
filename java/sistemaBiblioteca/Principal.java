package sistemaBiblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("o hobbit", "J.R.R. tolkien", 1937);
        Revista revista = new Revista("national geographic", "varios", 2021);
        Jornal jornal = new Jornal("the new york times", "varios", 2024);

        livro.emprestar();
        livro.reservar();
        livro.devolver();

        revista.emprestar();
        revista.reservar();
        revista.devolver();

        jornal.emprestar();
        jornal.devolver();
    }
}


