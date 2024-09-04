package sistemaVeiculos;

/*classe Carro que representa um carro.
 *implementa os métodos de ligar, desligar, acelerar e realizar manutenção*/
class Carro extends Veiculo implements Manutencao {

    /*construtor da classe Carro
     * @param marca Marca do carro
     * @param modelo Modelo do carro
     * @param ano Ano de fabricação do carro*/
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /*liga o carro*/
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " esta ligado.");
    }

    /*desliga o carro*/
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " esta desligado.");
    }

    /*acelera o carro*/
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " esta acelerando.");
    }

    /*realiza a manutenção do carro*/
    @Override
    public void realizarManutencao() {
        System.out.println("realizando manutencao no carro " + marca + " " + modelo + ".");
    }
}
