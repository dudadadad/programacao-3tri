package sistemaVeiculos;

/*classe Caminhao que representa um caminhão
 *implementa os métodos de ligar, desligar, acelerar e realizar manutenção*/
class Caminhao extends Veiculo implements Manutencao {

    /*construtor da classe Caminhao
     * @param marca Marca do caminhão
     * @param modelo Modelo do caminhão
     * @param ano Ano de fabricação do caminhão*/
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /*liga o caminhão*/
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " (caminhao) esta ligado.");
    }

    /*desliga o caminhão*/
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " (caminhao) esta desligado.");
    }

    /*acelera o caminhão*/
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " (caminhao) esta acelerando.");
    }

    /*realiza a manutenção do caminhão*/
    @Override
    public void realizarManutencao() {
        System.out.println("realizando manutencao no caminhao " + marca + " " + modelo + ".");
    }
}
