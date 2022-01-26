public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i < 100;i++){
            if (i%2 == 0){
                if(i == 98){
                    System.out.printf(i + "\n");
                }else{
                    System.out.printf(i + ", ");
                }
            }
        }
    }
}