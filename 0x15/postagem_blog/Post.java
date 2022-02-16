import java.util.Objects;

public class Post implements Comparable{
    private Autor autor;
    private String titulo, corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    @Override
    public String toString() {
        return  titulo;
    }

    @Override
    public boolean equals(Object o) {
        Post post = (Post) o;
        return this.getTitulo().equals(post.titulo) && this.getAutor().equals(post.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo, corpo, categoria);
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }

}
