package sistemaRestaurante;

/*classe PedidoComum que representa um pedido comum no restaurante
 *implementa as regras de manipulação de itens e cálculo do total para um pedido comum*/
class PedidoComum extends Pedido implements Desconto {
    private double valorTotal;

    public PedidoComum(int numeroPedido) {
        super(numeroPedido);
        this.valorTotal = 0.0;
    }

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        valorTotal += 10.0; 
        System.out.println("Item " + item + " adicionado ao pedido " + numeroPedido);
    }

    @Override
    public void removerItem(String item) {
        if (itens.remove(item)) {
            valorTotal -= 10.0;
            System.out.println("item" + item + " removido do pedido " + numeroPedido);
        } else {
            System.out.println("item" + item + " nao encontrado pedido " + numeroPedido);
        }
    }

    @Override
    public double calcularTotal() {
        return valorTotal;
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        double desconto = (porcentagem / 100) * valorTotal;
        valorTotal -= desconto;
        System.out.println("desconto de " + porcentagem + "% aplicado. total: " + valorTotal);
        return valorTotal;
    }
}
