package sistemaJogos;

public class Principal {
    public static void main(String[] args) {
        // criação dos objetos de cada tipo de jogo
        JogoDigital jogoDigital = new JogoDigital("the witcher 3", "RPG", 18);
        JogoTabuleiro jogoTabuleiro = new JogoTabuleiro("monopoly", "estrategia", 8);
        JogoCartas jogoCartas = new JogoCartas("poker", "cartas", 16);

        // teste dos métodos
        jogoDigital.iniciar();
        jogoDigital.conectarJogadores();
        jogoDigital.pausar();
        jogoDigital.finalizar();

        jogoTabuleiro.iniciar();
        jogoTabuleiro.pausar();
        jogoTabuleiro.finalizar();

        jogoCartas.iniciar();
        jogoCartas.pausar();
        jogoCartas.finalizar();
    }
}

