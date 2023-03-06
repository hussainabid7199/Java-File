// Write a program to print the following pattern. 
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    //   *******
    //    *****
    //     ***
    //      *



    public class Dimondpattern {
        public static void main(String args[]) {
            try {
                int n= 5;
                // Method 1


                // for(int i=1; i<=n; i++){
                //     for(int j=1; j<=n-i; j++){
                //         System.out.print(" ");
                //     }
                //     // Normal
                //     for(int k = i; k>=1; k--){
                //         System.out.print("*");
                //     }
                //     for(int l = 2; l<=i; l++){
                //             System.out.print("*");
                //     }
                //     System.out.println();
                // }
                // for(int i=n; i>=1; i--){
                //     for(int j=1; j<=n-i; j++){
                //         System.out.print(" ");
                //     }
                //     // Normal
                //     for(int k = i; k>=1; k--){
                //         System.out.print("*");
                //     }
                //     for(int l = 2; l<=i; l++){
                //             System.out.print("*");
                //     }
                //     System.out.println();
                // }

                // Method 2
                
                for(int i = 1; i<=n; i++){
                    for(int j = 1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j<=2*i-1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for(int i = n; i>=1; i--){
                    for(int j = 1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j<=2*i-1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } catch (Exception e) {
               throw e;
            }
        }
    }
    