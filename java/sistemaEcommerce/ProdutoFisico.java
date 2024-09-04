package sistemaEcommerce;

/*classe que representa um produto físico no sistema de e-commerce
 *implementa os métodos abstratos e a interface de promoção*/
public class ProdutoFisico extends Produto implements Promocao {
    private double taxaDeEntrega;

    public ProdutoFisico(String nome, double preco, String categoria, double taxaDeEntrega) {
        super(nome, preco, categoria);
        this.taxaDeEntrega = taxaDeEntrega;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaDeEntrega;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("produto fisico: " + nome);
        System.out.println("categoria: " + categoria);
        System.out.println("preco: R$" + preco);
        System.out.println("taxa de entrega: R$" + taxaDeEntrega);
        System.out.println("preco final: R$" + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao(double desconto) {
        preco -= preco * (desconto / 100);
    }
}

