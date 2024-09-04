package sistemaJogos;

/*classe que representa um jogo digital*/
public class JogoDigital extends Jogo implements Multiplayer {

    /*construtor para inicializar os atributos de um jogo digital 
     * @param titulo - O título do jogo digital
     * @param genero - O gênero do jogo digital
     * @param classificacaoEtaria A classificação etária do jogo digital*/
    public JogoDigital(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("iniciando o jogo digital: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("pausando o jogo digital: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("finalizando o jogo digital: " + titulo);
    }

    @Override
    public void conectarJogadores() {
        System.out.println("conectando jogadores no jogo digital: " + titulo);
    }
}

