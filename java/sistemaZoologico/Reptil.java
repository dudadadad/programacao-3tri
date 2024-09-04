package sistemaZoologico;

/*classe representando um réptil, que é uma subclasse de Animal*/
public class Reptil extends Animal implements Cuidador {

    /**
     * Construtor da classe Reptil.
     *
     * @param nome   Nome do réptil.
     * @param idade  Idade do réptil.
     * @param especie Espécie do réptil.
     */
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som caracteristico de reptil!");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando " + nome + " com insetos ou pequenos animais!");
    }

    @Override
    public void cuidar() {
        System.out.println("cuidando do reptil " + nome + "!");
    }
}

