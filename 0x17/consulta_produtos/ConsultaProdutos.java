import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> listaProduto, CriterioFiltro criterioFiltro){

        return listaProduto.stream().filter(p -> criterioFiltro.testar(p)).collect(Collectors.toList());
    }
}
