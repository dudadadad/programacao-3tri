package sistemaEcommerce;

/*classe que representa um produto digital no sistema de e-commerce
 *implementa os métodos abstratos e a interface de promoção*/
public class ProdutoDigital extends Produto implements Promocao {
    private double taxaDeLicenca;

    public ProdutoDigital(String nome, double preco, String categoria, double taxaDeLicenca) {
        super(nome, preco, categoria);
        this.taxaDeLicenca = taxaDeLicenca;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaDeLicenca;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("produto digital: " + nome);
        System.out.println("categoria: " + categoria);
        System.out.println("preco: R$" + preco);
        System.out.println("taxa de licenca: R$" + taxaDeLicenca);
        System.out.println("preco final: R$" + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao(double desconto) {
        preco -= preco * (desconto / 100);
    }
}

