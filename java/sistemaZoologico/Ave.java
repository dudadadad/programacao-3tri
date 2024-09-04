package sistemaZoologico;

/*classe representando uma ave, que é uma subclasse de Animal*/
public class Ave extends Animal implements Cuidador {

    /*construtor da classe Ave
     * @param nome   Nome da ave
     * @param idade  Idade da ave
     * @param especie Espécie da ave*/
    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um canto caracteristico de ave!");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando " + nome + " com sementes e frutas!");
    }

    @Override
    public void cuidar() {
        System.out.println("cuidando da ave " + nome + "!");
    }
}
