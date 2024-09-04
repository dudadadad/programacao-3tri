package sistemaVeiculos;

/*classe Moto que representa uma moto.
 *implementa os métodos de ligar, desligar, acelerar e realizar manutenção*/
class Moto extends Veiculo implements Manutencao {

    /*construtor da classe Moto
     * @param marca Marca da moto
     * @param modelo Modelo da moto
     * @param ano Ano de fabricação da moto*/
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /*liga a moto*/
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " (moto) esta ligada.");
    }

    /*desliga a moto*/
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " (moto) esta desligada.");
    }

    /*acelera a moto*/
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " (moto) esta acelerando.");
    }

    /*realiza a manutenção da moto*/
    @Override
    public void realizarManutencao() {
        System.out.println("realizando manutencao na moto " + marca + " " + modelo + ".");
    }
}
