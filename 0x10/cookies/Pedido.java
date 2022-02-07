import java.util.ArrayList;

public class Pedido {
    public ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidio) {
        cookies.add(pedidio);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int caixas = obterTotalCaixas();
        cookies.removeIf(caixa -> caixa.getSabor().equals(sabor));
        return caixas - obterTotalCaixas();
    }
}
