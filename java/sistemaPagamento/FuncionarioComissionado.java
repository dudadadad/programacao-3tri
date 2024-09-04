package sistemaPagamento;

public class FuncionarioComissionado extends Funcionario implements Pagamento {
    
    private double totalVendas;
    
    private double percentualComissao;
    
    /**
     * Construtor da classe FuncionarioComissionado.
     * 
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     * @param totalVendas O valor total das vendas realizadas.
     * @param percentualComissao O percentual de comissão sobre as vendas.
     */
    public FuncionarioComissionado(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double calcularSalario() {
        return this.salarioBase + (this.totalVendas * this.percentualComissao);
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("pagamento processado para " + nome + ". salario: R$" + calcularSalario());
    }
}

