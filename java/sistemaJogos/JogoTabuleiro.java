package sistemaJogos;

/*classe que representa um jogo de tabuleiro*/
public class JogoTabuleiro extends Jogo {

    /*construtor para inicializar os atributos de um jogo de tabuleiro
     * @param titulo - O título do jogo de tabuleiro
     * @param genero - O gênero do jogo de tabuleiro
     * @param classificacaoEtaria A classificação etária do jogo de tabuleiro*/
    public JogoTabuleiro(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("iniciando o jogo de tabuleiro: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("pausando o jogo de tabuleiro: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("finalizando o jogo de tabuleiro: " + titulo);
    }
}

