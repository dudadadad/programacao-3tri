package sistemaEcommerce;

/*classe abstrata que representa um produto genérico no sistema de e-commerce
 *contém os atributos comuns a todos os produtos e define os métodos abstratos
 *para cálculo de preço final e exibição de detalhes*/
public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /*metodo abstrato para calcular o preço final do produto
     *cada tipo de produto deve implementar sua própria lógica
     * @return o preço final do produto*/
    public abstract double calcularPrecoFinal();

    /*metodo abstrato para exibir os detalhes do produto.
     *cada tipo de produto deve implementar sua própria lógica*/
    public abstract void exibirDetalhes();
}

