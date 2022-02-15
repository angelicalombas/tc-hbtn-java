import java.util.*;

public class Blog {
    private List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();

       for (Post post: postagens){
           autores.add(post.getAutor());
       }

       return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();

        for (Post post: postagens){
            if (contagem.containsKey(post.getCategoria())){
                contagem.put(post.getCategoria(), contagem.get(post.getCategoria()) +1);
            }else{
                contagem.put(post.getCategoria(),1);
            }
        }

        return contagem;
    }
}
