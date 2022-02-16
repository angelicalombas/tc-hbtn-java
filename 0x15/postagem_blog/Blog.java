import java.util.*;

public class Blog {
    private List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem(Post postagem) {
        if (postagens.contains(postagem)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        for (Post post : postagens) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();

        for (Post post : postagens) {
            if (contagem.containsKey(post.getCategoria())) {
                contagem.put(post.getCategoria(), contagem.get(post.getCategoria()) + 1);
            } else {
                contagem.put(post.getCategoria(), 1);
            }
        }

        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postAutor = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getAutor().equals(autor)) {
                postAutor.add(post);
            }
        }
        return postAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postCategoria = new TreeSet<>();

        for (Post post : postagens) {
            if (post.getCategoria().equals(categoria)) {
                postCategoria.add(post);

            }
        }
        return postCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsCategoria = new TreeMap<>();
        Set<Post> posts;

        for (Post post : postagens) {
            posts = obterPostsPorCategoria(post.getCategoria());
            postsCategoria.put(post.getCategoria(), posts);
        }

        return postsCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPosts = new TreeMap<>();
        Set<Post> posts;

        for (Post post : postagens) {
            posts = obterPostsPorAutor(post.getAutor());
            todosPosts.put(post.getAutor(), posts);
        }

        return todosPosts;
    }

}
