import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf("Valor: " + String.format("R$ %,.3f",valor+0.001) + "\nTaxa: %.2f%%\n",taxa);
    }
}