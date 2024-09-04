package sistemaPagamento;

public class FuncionarioHorista extends Funcionario implements Pagamento {
    
    private int horasTrabalhadas;
    
    private double valorHora;
    
    /**
     * Construtor da classe FuncionarioHorista.
     * 
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     * @param horasTrabalhadas O número de horas trabalhadas.
     * @param valorHora O valor por hora trabalhada.
     */
    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("pagamento processado para " + nome + ". salario: R$" + calcularSalario());
    }
}
