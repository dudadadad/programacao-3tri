package sistemaEcommerce;

public class Principal {
    public static void main(String[] args) {
        ProdutoFisico livro = new ProdutoFisico("livro de java", 50.0, "educacao", 10.0);
        ProdutoDigital eBook = new ProdutoDigital("ebook de python", 30.0, "educacao", 5.0);
        ProdutoServico consultoria = new ProdutoServico("consultoria em TI", 100.0, "servicos", 5);

        System.out.println("antes da promocao:");
        livro.exibirDetalhes();
        eBook.exibirDetalhes();
        consultoria.exibirDetalhes();

        System.out.println("\naplicando promocao de 20%:");
        livro.aplicarPromocao(20);
        eBook.aplicarPromocao(20);
        consultoria.aplicarPromocao(20);

        System.out.println("\ndepois da promocao:");
        livro.exibirDetalhes();
        eBook.exibirDetalhes();
        consultoria.exibirDetalhes();
    }
}

