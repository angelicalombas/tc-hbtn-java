import provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
       Frete calculoFrete = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
       pedido.setFrete(calculoFrete);
    }
}
