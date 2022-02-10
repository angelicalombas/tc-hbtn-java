package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public double calcularFrete(double peso, double valor) {

        double valorTotal = 0;
        if (peso > 5000) {
            valorTotal = valor * 0.12;
        } else {
            valorTotal = valor * 0.04;
        }

        return valorTotal;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
