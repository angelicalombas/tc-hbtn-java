import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public List<Double>  transacoes;

    public Cliente(String nome, double valorTransacao) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao){
        transacoes.add(valorTransacao);
    }
}
