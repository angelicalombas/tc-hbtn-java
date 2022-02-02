public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
       double total =0;
        for (ItemPedido item : itens) {
            total += (item.getProduto().obterPrecoLiquido()*item.getQuantidade());
        }
        return total-(total*(percentualDesconto/100));
    }
}
