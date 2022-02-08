public class Contato {
    public String nome;
    public String numero;
    public TipoNumero tipo;

    public Contato(String nome, String numero, TipoNumero tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipo() {
        return tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
