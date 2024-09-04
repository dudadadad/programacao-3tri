package sistemaVeiculos;

/*classe abstrata Veiculo que representa um veículo genérico
 *contém os atributos comuns a todos os veículos e define os métodos abstratos para ligar, desligar e acelerar*/
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    /*construtor da classe Veiculo
     * @param marca Marca do veículo
     * @param modelo Modelo do veículo
     * @param ano Ano de fabricação do veículo*/
    
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /*metodo abstrato para ligar o veículo
     * Deve ser implementado pelas subclasses*/
    public abstract void ligar();

    /*metodo abstrato para desligar o veículo
     * Deve ser implementado pelas subclasses*/
    public abstract void desligar();

    /*metodo abstrato para acelerar o veículo
     * Deve ser implementado pelas subclasses*/
    public abstract void acelerar();
}
