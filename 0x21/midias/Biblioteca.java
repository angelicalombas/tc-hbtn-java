import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca<T extends Midia> {
    private List<T> lista = new ArrayList<>();

    public void adicionarMidia( T elemento){
        lista.add(elemento);
    }

    public List<T> obterListaMidias(){
      return   lista.stream().collect(Collectors.toList());
    }
}
