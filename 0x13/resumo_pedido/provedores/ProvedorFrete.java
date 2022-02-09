package provedores;

import Frete;

public interface ProvedorFrete {

    Frete calcularFrete(double peso, double valor);

    TipoProvedorFrete obterTipoProvedorFrete();

}
