package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        double valorTotal = 0;
        if (peso > 5000) {
            valorTotal = valor * 0.12;
        } else {
            valorTotal = valor * 0.04;
        }
        frete.setValor(valorTotal);
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
