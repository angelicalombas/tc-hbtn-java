import comida.Comida;
import humor.*;

public class Personagem {

    public int pontosDeFelicidade;

    public String obterHumorAtual() {
        if (pontosDeFelicidade < -5) {
            Humor objetoHumor = new Irritado();
            return objetoHumor.getClass().getSimpleName();
        } else if (pontosDeFelicidade > -5 && pontosDeFelicidade < 0) {
            Humor objetoHumor = new Triste();
            return objetoHumor.getClass().getSimpleName();
        } else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15) {
            Humor objetoHumor = new Feliz();
            return objetoHumor.getClass().getSimpleName();
        } else if (pontosDeFelicidade > 15) {
            Humor objetoHumor = new Feliz();
            return objetoHumor.getClass().getSimpleName();
        } else {
            return "";
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual();
    }

}
