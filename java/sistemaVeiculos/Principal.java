package sistemaVeiculos;

public class Principal {
    public static void main(String[] args) {
        // criando instâncias dos veículos
        Caminhao caminhao = new Caminhao("volvo", "FH", 2022);
        Carro carro = new Carro("toyota", "corolla", 2020);
        Moto moto = new Moto("honda", "CB500", 2021);

        // chamando os métodos do caminhão
        caminhao.ligar();
        caminhao.acelerar();
        caminhao.desligar();
        caminhao.realizarManutencao();

        // chamando os métodos do carro
        carro.ligar();
        carro.acelerar();
        carro.desligar();
        carro.realizarManutencao();

        // chamando os métodos da moto
        moto.ligar();
        moto.acelerar();
        moto.desligar();
        moto.realizarManutencao();
    }
}

