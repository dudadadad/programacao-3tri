package sistemaTransportes;

/*classe que representa um avião
 *implementa a interface Combustivel*/
class Aviao extends Transporte implements Combustivel {
    /*construtor da classe Aviao
     * @param capacidade - a capacidade do avião
     * @param velocidadeMaxima - a velocidade máxima do avião
     */
    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /*metodo que descreve como o avião se move*/
    @Override
    public void mover() {
        System.out.println("o aviao esta voando a " + velocidadeMaxima + " km/h.");
    }

    /*metodo que descreve como o avião para*/
    @Override
    public void parar() {
        System.out.println("o aviao pousou e parou!!");
    }

    /*metodo que descreve como o avião é abastecido*/
    @Override
    public void abastecer() {
        System.out.println("o aviao esta sendo abastecido com querosene de aviacao!!");
    }
}

