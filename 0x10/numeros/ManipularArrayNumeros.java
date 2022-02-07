import java.util.List;

public class ManipularArrayNumeros {


    static public int buscarPosicaoNumero(List<Integer> list, int numero){
        if(list.contains(numero)){
            return list.indexOf(numero);
        }else{
            return -1;
        }
    }

    static public void adicionarNumero(List<Integer> list, int numero) throws Exception {
        if (buscarPosicaoNumero(list,numero) >= 0){
            throw new Exception("Numero jah contido na lista");
        }else{
            list.add(numero);
        }

    }

    static public void removerNumero(List<Integer> list, int numero) throws Exception {
        if (buscarPosicaoNumero(list,numero) == -1){
            throw new Exception("Numero nao encontrado na lista");
        }else{
            list.remove(buscarPosicaoNumero(list,numero));
        }

    }

    static public void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) throws Exception {
        if (buscarPosicaoNumero(list,numeroSubstituir) == -1){
            adicionarNumero(list,numeroSubstituto );
        }else{
            list.set(buscarPosicaoNumero(list,numeroSubstituir),numeroSubstituto);
        }

    }

}
