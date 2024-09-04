package sistemaPagamento;

public class FuncionarioMensalista extends Funcionario implements Pagamento {
    
    /**
     * Construtor da classe FuncionarioMensalista.
     * 
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
   
    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("pagamento processado para " + nome + ". salario: R$" + calcularSalario());
    }
}
