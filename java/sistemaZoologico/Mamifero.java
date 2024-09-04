package sistemaZoologico;

/*classe representando um mamífero, que é uma subclasse de Animal*/
public class Mamifero extends Animal implements Cuidador {

    /*construtor da classe Mamifero
     * @param nome   Nome do mamífero
     * @param idade  Idade do mamífero
     * @param especie Espécie do mamífero*/
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som caracteristico de mamifero!");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando " + nome + " com alimentos para mamiferos!");
    }

    @Override
    public void cuidar() {
        System.out.println("cuidando do mamifero " + nome + "!");
    }
}

