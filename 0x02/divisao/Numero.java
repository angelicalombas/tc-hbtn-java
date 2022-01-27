public class Numero {

    public static void dividir(int a, int b){
        int resultado =0;
        try{
            resultado = a/b;

        }catch (Exception exc){
            System.out.println("Nao eh possivel dividir por zero");
        }finally {
            if (b != 0){
                System.out.println(a + " / " + b + " = " + resultado);
            }else{
                System.out.println(a + " / " + b + " = 0" );
            }
        }
    }

}
