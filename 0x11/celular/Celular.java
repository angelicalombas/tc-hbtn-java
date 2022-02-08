import java.util.ArrayList;
import java.util.List;

public class Celular {
    public List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        for (Contato contatoN : contatos) {
            if (contato.nome.equals(contatoN.nome)) {
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        }
        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {

       Contato contatoEncontrado = buscarContato(contatoAntigo.getNome());

       if (contatoEncontrado == null){
           throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
       }else if(contatoAntigo.getNome() != novoContato.getNome() && buscarContato(novoContato.getNome()) !=null){

           throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
       }

       Integer posicaoContato = obterPosicaoContato(contatoAntigo.getNome());
       this.contatos.set(posicaoContato, novoContato);

    }

    public void removerContato(Contato contato) {
        if (buscarContato(contato.getNome())== null){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        this.contatos.remove(contatos.indexOf(buscarContato(contato.getNome())));
    }

    public Integer obterPosicaoContato(String nome){
        for (int i =0; i < this.contatos.size();i++){
            if (this.contatos.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return null;
    }

    public Contato buscarContato(String nome) {
        Integer posicaoContato = obterPosicaoContato(nome);
        if(posicaoContato == null)
            return null;
        return contatos.get(posicaoContato);
    }

    public void listarContatos() {
        for (Contato contatoN : contatos) {
            System.out.println(contatoN.getNome() + " -> " + contatoN.getNumero() + " " + "(" + contatoN.getTipo() + ")");
        }
    }

}
