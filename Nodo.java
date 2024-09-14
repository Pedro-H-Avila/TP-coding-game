public class Nodo {
    String palavra;
    List<Integer> linhas; // Linhas em que a palavra aparece
    Nodo esquerda, direita;

    public Nodo(String palavra, int linha) {
        this.palavra = palavra;
        this.linhas = new ArrayList<>();
        this.linhas.add(linha);
        this.esquerda = null;
        this.direita = null;
    }

    // Método compareTo para comparar palavras em ordem alfabética
    @Override
    public int compareTo(Nodo outro) {
        return this.palavra.compareTo(outro.palavra);
    }

    // Imprime a palavra e as linhas onde ela aparece
    public void imprimePalavra() {
        System.out.print(this.palavra + " ");
        for (int linha : linhas) {
            System.out.print(linha + " ");
        }
        System.out.println();
    }
}
