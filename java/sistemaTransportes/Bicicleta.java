package sistemaTransportes;

/*classe que representa uma bicicleta*/
class Bicicleta extends Transporte {
    /*construtor da classe Bicicleta
     * @param capacidade - a capacidade da bicicleta
     * @param velocidadeMaxima - a velocidade máxima da bicicleta
     */
    public Bicicleta(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /*metodo que descreve como a bicicleta se move*/
    @Override
    public void mover() {
        System.out.println("a bicicleta esta sendo pedalada a " + velocidadeMaxima + " km/h.");
    }

    /*metodo que descreve como a bicicleta para*/
    @Override
    public void parar() {
        System.out.println("a bicicleta parou!!");
    }
}

