public class Hollowrombous {
    public static void main(String args[]) {
        try {
            int n = 5;

            for(int i=1; i<=n; i++){
                for(int j = n; j>=i; j--){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
                    if(i==1 || i==n || j == 1 || j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
