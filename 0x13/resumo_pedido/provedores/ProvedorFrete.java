package provedores;

import resumo_pedido.Frete;

public interface ProvedorFrete {

    Frete calcularFrete(double peso, double valor);

    TipoProvedorFrete obterTipoProvedorFrete();

}
