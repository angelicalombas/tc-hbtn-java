import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<>();
    }

    ArrayList<Telefone> numeroLista = new ArrayList<>();

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        HashSet<Telefone> telefones = new HashSet<>();

        if(listaTelefonica.containsKey(nome) && listaTelefonica.get(nome).contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }

        if(numeroLista.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }

        numeroLista.add(telefone);

        if (listaTelefonica.containsKey(nome)){
            //se o telefone referênte ao nome constar na lista de telefones adicione mais um
            listaTelefonica.get(nome).add(telefone);
        }else{
            telefones.add(telefone);
            listaTelefonica.put(nome,telefones);
        }

    return telefones;

    }

    public HashSet<Telefone> buscar(String nome){
        return listaTelefonica.get(nome);
    }

}
