import static jdk.nashorn.internal.objects.NativeString.substring;
public class PrintStringVariable {
    public static void main(String[] args) {
        String texto = "Holberton School";
        for (int i = 0;i<2;i++){System.out.println(texto);} System.out.println(substring(texto,0,9));}
}
