package sistemaRestaurante;

/*classe PedidoReserva que representa um pedido de reserva no restaurante
 *implementa as regras de manipulação de itens e cálculo do total para um pedido de reserva*/
class PedidoReserva extends Pedido {

    /*construtor da classe PedidoReserva
     *@param numeroPedido Número do pedido*/
    public PedidoReserva(int numeroPedido) {
        super(numeroPedido);
    }

    /*adiciona um item ao pedido de reserva
     *@param item Nome do item a ser adicionado*/
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("item " + item + " adicionado ao pedido de reserva " + numeroPedido);
    }

    /*remove um item do pedido de reserva
     *@param item Nome do item a ser removido*/
    @Override
    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println("item " + item + " removido do pedido de reserva " + numeroPedido);
        } else {
            System.out.println("item " + item + " nao encontrado no pedido de reserva " + numeroPedido);
        }
    }

    /*calcula o total do pedido de reserva
     *@return O valor total do pedido de reserva (neste caso, 0.0)*/
    @Override
    public double calcularTotal() {
        return 0.0; // as reservas podem nao ter um custo associado
    }
}
