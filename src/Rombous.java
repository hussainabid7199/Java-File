public class Rombous {
   public static void main(Stringlearn args[]){
    try {
        int n = 5;
        // int o = 9;
        for(int i =1; i<= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } catch (Exception e) {
        throw e;
    }
   } 
}
