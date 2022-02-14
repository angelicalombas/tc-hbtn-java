import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String,Integer> contagemPalavras(String frase) {
        frase = frase.toLowerCase();
        frase = frase.replace("!","");
        frase = frase.replace("?","");
        frase = frase.replace(".","");

        TreeMap<String, Integer> contagem = new TreeMap<String, Integer>();
        String[] palavras = frase.split(" ");

        for (String p : palavras) {
            if (contagem.containsKey(p)) {
                contagem.put (p, contagem.get(p) + 1);
            } else {
                contagem.put (p, 1);
            }
        }

        return contagem;
    }
}
