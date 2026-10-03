package src;
import java.util.ArrayList;
import java.util.List;

public class Repository<T> { //Passo 1: alterei de repostiroio de produtos para repositorio<t> para deixar generico

    private List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public List<T> listarTodos() {
        return itens;
    }
}