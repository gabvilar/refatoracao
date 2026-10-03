package src;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Passo 1: alterei de ProdutoRepository para Repository<Produto>
        Repository<Produto> repository = new Repository<>();

        repository.adicionar(
            new Produto("Notebook", "Eletrônicos", 3500)
        );

        repository.adicionar(
            new Produto("Mouse", "Eletrônicos", 120)
        );

        repository.adicionar(
            new Produto("Teclado", "Eletrônicos", 250)
        );

        repository.adicionar(
            new Produto("Cadeira", "Móveis", 900)
        );

        repository.adicionar(
            new Produto("Mesa", "Móveis", 700)
        );

        ProdutoService service = new ProdutoService();

        List<Produto> produtos = repository.listarTodos();

        System.out.println("=== ELETRÔNICOS ===");

        //Passo 2 e 4: alterei pro lambda(utilizei basicamente o que tinha antes no buscarPorCategoria)
        List<Produto> eletronicos = service.filtrar(produtos, produto -> produto.getCategoria().equalsIgnoreCase("Eletrônicos"));
        
        //Passo 5: alterei o for para .stream().ForEach(condição) como pede, assim fica mais enxuto
        eletronicos.forEach(produto -> System.out.println(produto));

        System.out.println("\n=== ATÉ R$ 800 ===");

        //Passo 2 e 4: alterei pro lambda(utilizei basicamente o que tinha antes no buscarAbaixoDoPreco)
        List<Produto> baratos = service.filtrar(produtos, produto -> produto.getPreco() <= 800);

        //Passo 5
        baratos.forEach(produto -> System.out.println(produto));

        System.out.println("\n=== NOMES ===");

        List<String> nomes = service.obterNomes(produtos);

        //Passo 5
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("\n=== ORDENADOS POR PREÇO ===");

        //tive que colocar List<Produto> ordenados já que antes a função ordenarPorPreço() era void, e agora não é mais
        List<Produto> ordenados = service.ordenarPorPreco(produtos);

        //Passo 5
        ordenados.forEach(produto -> System.out.println(produto));
    }
}