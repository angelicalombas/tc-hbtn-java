public class InteiroPositivo {
    public Integer valor;

    public InteiroPositivo(int valor) throws Exception {
        this.valor = valor;
        setValor(this.valor);
    }

    public InteiroPositivo(String valor) throws Exception {
        this.valor = Integer.valueOf(valor);
        setValor(this.valor);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception {
        if (valor == null || valor < 0) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public boolean ehPrimo() {
        for (int i = 2; i < getValor(); i++) {
            if (getValor() % i == 0)
                return false;
        }
        if (getValor() != 1) {
            return true;
        } else {
            return false;
        }
    }
}
