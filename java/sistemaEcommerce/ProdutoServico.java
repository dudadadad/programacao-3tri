package sistemaEcommerce;

/*classe que representa um serviço no sistema de e-commerce
 *implementa os métodos abstratos e a interface de promoção*/
public class ProdutoServico extends Produto implements Promocao {
    private int duracaoEmHoras;

    public ProdutoServico(String nome, double preco, String categoria, int duracaoEmHoras) {
        super(nome, preco, categoria);
        this.duracaoEmHoras = duracaoEmHoras;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * duracaoEmHoras;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("servico: " + nome);
        System.out.println("categoria: " + categoria);
        System.out.println("preco por hora: R$" + preco);
        System.out.println("duracao: " + duracaoEmHoras + " horas");
        System.out.println("preco final: R$" + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao(double desconto) {
        preco -= preco * (desconto / 100);
    }
}

