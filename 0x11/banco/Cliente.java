import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public ArrayList<Double> transacoes;

    public Cliente(String nome, double valorTransacao) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao){
        transacoes.add(valorTransacao);
    }
}
