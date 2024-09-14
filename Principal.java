import java.io.*;
import java.text.Normalizer;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();

        try (BufferedReader leitor = new BufferedReader(new FileReader("arquivo.txt"))) {
            String linha;
            int numeroLinha = 1;

            while ((linha = leitor.readLine()) != null) {
                // Formatar a linha
                String linhaNormalizada = Normalizer.normalize(linha, Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", ""); // Remove acentos
                linhaNormalizada = linhaNormalizada.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

                // Dividir a linha em palavras
                String[] palavras = linhaNormalizada.split("\\s+");

                // Inserir as palavras na árvore
                for (String palavra : palavras) {
                    if (palavra.length() >= 3) {
                        arvore.inserir(palavra, numeroLinha);
                    }
                }

                numeroLinha++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Imprimir as palavras em ordem alfabética
        arvore.emOrdem();
    }
}
