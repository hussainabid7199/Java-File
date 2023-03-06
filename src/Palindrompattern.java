// Write a program to print the following pattern. 
    //      1
    //     212
    //    32123
    //   4321234
    //  543212345



public class Palindrompattern {
    public static void main(String args[]) {
        try {
            int n= 5;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k = i; k>=1; k--){
                    System.out.print(k);
                }
                for(int l = 2; l<=i; l++){
                        System.out.print(l);
                }
                System.out.println();
            }
        } catch (Exception e) {
           throw e;
        }
    }
}
