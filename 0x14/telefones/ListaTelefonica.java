import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        //se o nome constar no array listaTelefonica, adicona mais um telefone no array telefones
        ArrayList<Telefone> telefones = new ArrayList<>();
        if (listaTelefonica.containsKey(nome)){
            telefones.contains(listaTelefonica.get(nome).add(telefone));
        }else{
            telefones.add(telefone);
            listaTelefonica.put(nome,telefones);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        return listaTelefonica.get(nome);
    }

}
