import java.util.Objects;

public class Autor implements Comparable{
    public String nome, sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

    @Override
    public int compareTo(Object o) {
        Autor autor = (Autor) o;
        return this.toString().compareTo(autor.toString());
    }

}
