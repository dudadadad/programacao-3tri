package sistemaJogos;

/*classe abstrata que representa um jogo genérico*/
public abstract class Jogo {
    protected String titulo;
    protected String genero;
    protected int classificacaoEtaria;

    /*construtor para inicializar os atributos de um jogo
     * @param titulo - O título do jogo
     * @param genero - O gênero do jogo
     * @param classificacaoEtaria A classificação etária do jogo*/
    public Jogo(String titulo, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    /*metodo abstrato para iniciar o jogo*/
    public abstract void iniciar();

    /*metodo abstrato para pausar o jogo*/
    public abstract void pausar();

    /*metodo abstrato para finalizar o jogo*/
    public abstract void finalizar();
}

