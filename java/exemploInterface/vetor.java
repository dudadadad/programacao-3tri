package exemploInterface;

public class vetor implements lista {
    private String[] elementos;
    private int tamanho;

    public vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    @Override 
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override 
    public String remove() {
        if (tamanho > 0) {
            return elementos[--tamanho];
        }
        return null;
    }

    @Override
    public String toString() {
        String retorno = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) { // correcao aqui
                retorno += elementos[i] + ", ";
            }
            retorno += elementos[tamanho - 1];
        }
        retorno += "]";
        return retorno;
    }
}
