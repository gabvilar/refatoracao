package src;
//apaguei os imports daqui de cima pois viraram inuteis
import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {
    //Passo 2: apaguei as 2 condições que exisitam e transormei numa só chamada filtrar para usar o lambda e assim so precisar ter 1
    //Passo 3: transformei cada uma das funções em funções com stream()
    public List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> condicao){ //condicao é o lambda
        return produtos.stream().filter(condicao).toList(); //usei o stream
        //stream(): lê a lista - no caso produtos
        //.filter(x): filtra de acordo com a regra x - no caso condicao passada na main
        //toList(): ele cria e devolve uma lista nova - no caso pega os produtos que passaram na condição
    }

    public List<String> obterNomes(List<Produto> produtos) {
        return produtos.stream().map(produto -> produto.getNome()).toList();
        //stream(): lê a lista - no caso produtos
        //.map(x): transforma cada elemento em outra coisa com base na condição x
        //toList(): ele cria e devolve uma lista nova - no caso pega os nomes de cada produto e cria uma lsita com eles 
    }

    public List<Produto> ordenarPorPreco(List<Produto> produtos) {
        return produtos.stream().sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).toList();
        //stream(): lê a lista - no caso produtos
        //.sorted(x): ordena os elementos com base na condição x 
        //toList(): ele cria e devolve uma lista nova - no caso compara cada produto e cria uma lsita ordenada 
    }
}