import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> listaProduto, Predicate<Produto> criterioFiltro){
        return listaProduto.stream().filter(p -> criterioFiltro.test(p)).collect(Collectors.toList());
    }
}
