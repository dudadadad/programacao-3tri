package sistemaRestaurante;

public class Principal {
    public static void main(String[] args) {
        PedidoComum pedidoComum = new PedidoComum(1);
        pedidoComum.adicionarItem("pizza");
        pedidoComum.adicionarItem("bebida");
        System.out.println("total do pedido comum: " + pedidoComum.calcularTotal());
        pedidoComum.aplicarDesconto(10.0);
        
        PedidoDelivery pedidoDelivery = new PedidoDelivery(2, 5.0);
        pedidoDelivery.adicionarItem("hamburguer");
        pedidoDelivery.adicionarItem("batata frita");
        System.out.println("tatal do pedido delivery: " + pedidoDelivery.calcularTotal());
        
        PedidoReserva pedidoReserva = new PedidoReserva(3);
        pedidoReserva.adicionarItem("mesa para 4");
        pedidoReserva.adicionarItem("decoracao");
        System.out.println("total do pedido reserva: " + pedidoReserva.calcularTotal());
        
        pedidoComum.removerItem("bebida");
        pedidoDelivery.removerItem("batata frita");
        pedidoReserva.removerItem("decoracao");
        
        System.out.println("total do pedido comum apos remocao: " + pedidoComum.calcularTotal());
        System.out.println("total do pedido delivery apos remocao: " + pedidoDelivery.calcularTotal());
        System.out.println("total do pedido reserva apos remocao: " + pedidoReserva.calcularTotal());
    }
}

