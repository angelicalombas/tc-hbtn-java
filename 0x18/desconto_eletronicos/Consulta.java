import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        return pedido.getProdutos().stream().filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produto) {
        return produto.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int i) {

        return produtos.stream().filter(produto -> produto.getPreco() >= i).collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {

        return pedidos.stream().filter(pedido -> pedido.getProdutos().stream().anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO))).collect(Collectors.toList());

    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {

        produtos.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO))
                .map(produto -> {
                    produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
                    return produto;
                }).collect(Collectors.toList());

        return produtos;
    }

}
