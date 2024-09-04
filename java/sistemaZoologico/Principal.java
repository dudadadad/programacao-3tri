package sistemaZoologico;

/*classe principal para testar o sistema de gerenciamento de animais*/
public class Principal {
    public static void main(String[] args) {
        Animal leão = new Mamifero("leao", 5, "panthera leo");
        Animal papagaio = new Ave("papagaio", 2, "amazona amazonica");
        Animal cobra = new Reptil("cobra", 3, "serpente");

        // testando os metodos de cada animal
        leão.emitirSom();
        leão.alimentar();
        ((Cuidador) leão).cuidar();

        papagaio.emitirSom();
        papagaio.alimentar();
        ((Cuidador) papagaio).cuidar();

        cobra.emitirSom();
        cobra.alimentar();
        ((Cuidador) cobra).cuidar();
    }
}

