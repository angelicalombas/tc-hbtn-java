import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    public double percentualMarkUp = 10;

    public Supplier<Double> precoComMarkUp = () -> (percentualMarkUp/100)*preco+preco;

    public Consumer<Double> atualizarMarkUp = d -> percentualMarkUp = d;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
