package sistemaTransportes;

/*classe que representa um carro
 *implementa a interface Combustivel*/
class Carro extends Transporte implements Combustivel {
    /*construtor da classe Carro
     * @param capacidade - a capacidade do carro
     * @param velocidadeMaxima - a velocidade máxima do carro
     */
    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /*metodo que descreve como o carro se move*/
    @Override
    public void mover() {
        System.out.println("o carro esta se movendo a " + velocidadeMaxima + " km/h.");
    }

    /*metodo que descreve como o carro para*/
    @Override
    public void parar() {
        System.out.println("o carro parou!!");
    }

    /*metodo que descreve como o carro é abastecido*/
    @Override
    public void abastecer() {
        System.out.println("o carro esta sendo abastecido com gasolina!!");
    }
}

