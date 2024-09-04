package sistemaTransportes;

/*classe principal para testar o sistema de transportes*/
public class Principal {
    public static void main(String[] args) {
        Transporte carro = new Carro(5, 180.0);
        Transporte bicicleta = new Bicicleta(1, 25.0);
        Transporte aviao = new Aviao(180, 900.0);

        carro.mover();
        carro.parar();
        ((Carro) carro).abastecer();

        bicicleta.mover();
        bicicleta.parar();

        aviao.mover();
        aviao.parar();
        ((Aviao) aviao).abastecer();
    }
}

