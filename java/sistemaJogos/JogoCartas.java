package sistemaJogos;

/*classe que representa um jogo de cartas*/
public class JogoCartas extends Jogo {

    /*construtor para inicializar os atributos de um jogo de cartas
     * @param titulo - O título do jogo de cartas
     * @param genero - O gênero do jogo de cartas
     * @param classificacaoEtaria A classificação etária do jogo de cartas*/
    public JogoCartas(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("iniciando o jogo de cartas: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("pausando o jogo de cartas: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("finalizando o jogo de cartas: " + titulo);
    }
}

