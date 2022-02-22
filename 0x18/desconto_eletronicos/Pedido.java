import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
    private int codigo;
    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return codigo == pedido.codigo && produtos.equals(pedido.produtos) && cliente.equals(pedido.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, produtos, cliente);
    }

    @Override
    public String toString() {
        return String.format("[%d] %s",getCodigo(),getCliente().getNome());
    }
}
