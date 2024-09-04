package sistemaTransportes;

/*classe abstrata que representa um transporte generico*/
public abstract class Transporte {
    protected int capacidade;
    protected double velocidadeMaxima;

    /*construtor da classe Transporte
     * @param capacidade - a capacidade do transporte
     * @param velocidadeMaxima - a velocidade máxima do transporte
     */
    public Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /*metodo abstrato que define como o transporte se move*/
    public abstract void mover();

    /*metodo abstrato que define como o transporte para*/
    public abstract void parar();
}

