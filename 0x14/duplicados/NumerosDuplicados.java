import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numero){
        Set<Integer> ordenados = new HashSet<Integer>();
        TreeSet<Integer> ordenadosTree = new TreeSet<>();

        for(int numeros: numero){
            if(!ordenados.add(numeros)){
                ordenadosTree.add(numeros);
            }
        }

        return ordenadosTree;
    }

}
