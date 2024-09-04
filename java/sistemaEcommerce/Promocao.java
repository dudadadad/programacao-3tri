package sistemaEcommerce;

/*interface que define o método para aplicar promoções em produtos*/
public interface Promocao {
    /*aplica uma promoção ao produto, ajustando seu preço
     * @param desconto a porcentagem de desconto a ser aplicada*/
    void aplicarPromocao(double desconto);
}

