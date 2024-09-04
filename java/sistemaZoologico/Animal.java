package sistemaZoologico;

/*classe abstrata representando um animal no zoologico*/
public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    /*construtor da classe Animal
     * @param nome   Nome do animal
     * @param idade  Idade do animal
     * @param especie Espécie do animal*/
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /*metodo abstrato para emitir o som do animal*/
    public abstract void emitirSom();

    /*metodo abstrato para alimentar o animal*/
    public abstract void alimentar();
}

