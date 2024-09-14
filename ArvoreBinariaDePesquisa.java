public class ArvoreBinariaDePesquisa {
    Nodo raiz;

    public ArvoreBinariaDePesquisa() {
        this.raiz = null;
    }

    private void emOrdemRecursivo(Nodo atual) {
        if (atual != null) {
            emOrdemRecursivo(atual.esquerda);
            atual.imprimePalavra();
            emOrdemRecursivo(atual.direita);
        }
    }
}
