package sistemaPagamento;

public class Principal {

    public static void main(String[] args) {
        FuncionarioMensalista mensalista = new FuncionarioMensalista("joao", 3000.00);
        FuncionarioHorista horista = new FuncionarioHorista("maria", 0, 160, 20.00);
        FuncionarioComissionado comissionado = new FuncionarioComissionado("pedro", 1500.00, 50000.00, 0.10);

        mensalista.processarPagamento();
        horista.processarPagamento();
        comissionado.processarPagamento();
    }
}
