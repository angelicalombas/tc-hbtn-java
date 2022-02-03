import produtos.Produto;
import produtos.Livro;
import java.text.NumberFormat;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    NumberFormat f = NumberFormat.getCurrencyInstance();

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        return total - (total * (percentualDesconto / 100));
    }

    public double calcularDescontoTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        return (total * (percentualDesconto / 100));
    }

    public void apresentarResumoPedido() {

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            String titulo = item.getProduto().getTitulo();
            double precoLiquido = item.getProduto().obterPrecoLiquido();
            int quantidade = item.getQuantidade();
            double total = precoLiquido * quantidade;
            String tipo = item.getProduto().getClass().getSimpleName();

            System.out.printf("Tipo: " + tipo + "  Titulo: " + titulo + "  Preco: " + f.format(precoLiquido) +
                    "  Quant: " + quantidade + "  Total: " + f.format(total) + "\n");
        }

        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + f.format(calcularDescontoTotal()));
        System.out.println("TOTAL PRODUTOS: " + f.format(calcularTotal() + calcularDescontoTotal()));
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + f.format(calcularTotal()));
        System.out.println("----------------------------");
    }
}
