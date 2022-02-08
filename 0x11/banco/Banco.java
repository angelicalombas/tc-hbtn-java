import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    public List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<>();
    }

    public boolean adicionarAgencia(String nomeAgencia){
        Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

        //se agencia existe retorna falso
        if(agenciaEncontrada != null){
            return false;
        }

        //se agencia não existe cria e adiciona a lista
        Agencia novaAgencia = new Agencia(nomeAgencia);
        agencias.add(novaAgencia);
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

        //se agencia não existe retorna falso
        if(agenciaEncontrada == null){
            return false;
        }

        //se agencia existe cria cliente e adiciona transação
        agenciaEncontrada.novoCliente(nomeCliente,valorTransacao);
        agenciaEncontrada.adicionarTransacaoCliente(nomeCliente,valorTransacao);
        return true;

    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

        //se agencia não existe retorna falso
        if(agenciaEncontrada == null){
            return false;
        }

        agenciaEncontrada.adicionarTransacaoCliente(nomeCliente,valorTransacao);
        return true;
    }

    public Agencia buscarAgencia(String nomeAgencia){
        for (int i =0; i < this.agencias.size();i++){
            if (this.agencias.get(i).getNome().equals(nomeAgencia)){
                return agencias.get(i);
            }
        }
        return null;
    }


    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agenciaEncontrada = buscarAgencia(nomeAgencia);

        if (agenciaEncontrada == null) {
            return false;
        }

        for (int i = 0; i < agenciaEncontrada.getClientes().size(); i++) {
            Cliente clienteEncontrado = agenciaEncontrada.getClientes().get(i);
            System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (i + 1) + "]");

                if (imprimirTransacoes) {
                    for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
                        System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
                    }
                }
            }
            return true;
        }
}
