package sistemaPagamento;

public abstract class Funcionario {
    
    protected String nome;
    
    protected double salarioBase;
    
    /**
     * Construtor da classe Funcionario.
     * 
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
}
