import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProdutoService {

    public List<Produto> buscarPorCategoria(
            List<Produto> produtos,
            String categoria) {

        List<Produto> resultado = new ArrayList<>();

        for (Produto produto : produtos) {

            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(produto);
            }
        }

        return resultado;
    }

    public List<Produto> buscarAbaixoDoPreco(
            List<Produto> produtos,
            double precoMaximo) {

        List<Produto> resultado = new ArrayList<>();

        for (Produto produto : produtos) {

            if (produto.getPreco() <= precoMaximo) {
                resultado.add(produto);
            }
        }

        return resultado;
    }

    public List<String> obterNomes(
            List<Produto> produtos) {

        List<String> nomes = new ArrayList<>();

        for (Produto produto : produtos) {
            nomes.add(produto.getNome());
        }

        return nomes;
    }

    public void ordenarPorPreco(List<Produto> produtos) {

        Collections.sort(
            produtos,
            new Comparator<Produto>() {

                @Override
                public int compare(Produto p1, Produto p2) {

                    return Double.compare(
                        p1.getPreco(),
                        p2.getPreco()
                    );
                }
            }
        );
    }
}