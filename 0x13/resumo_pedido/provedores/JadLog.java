package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        double valorTotal = 0;
        if (peso > 2000) {
            valorTotal = valor * 0.07;
        } else {
            valorTotal = valor * 0.045;
        }
        frete.setValor(valorTotal);
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
