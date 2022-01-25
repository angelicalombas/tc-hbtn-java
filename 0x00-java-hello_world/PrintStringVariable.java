import static jdk.nashorn.internal.objects.NativeString.substring;
public class PrintStringVariable {
    public static void main(String[] args) {
        String texto = "Holberton School";
        System.out.println(texto +"\n"+ texto +"\n"+ substring(texto,0,9));}
}
