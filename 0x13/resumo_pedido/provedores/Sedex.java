package provedores;

import Frete;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        double valorTotal = 0;
        if (peso > 1000) {
            valorTotal = valor * 0.10;
        } else {
            valorTotal = valor * 0.05;
        }
        frete.setValor(valorTotal);
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
