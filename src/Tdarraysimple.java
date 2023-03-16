import java.util.Scanner;

public class Tdarraysimple {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int row_start = 0;
            int col_start = 0;
            int row_end = n - 1;
            int col_end = m - 1;
            int num[][] = new int[n][m];


            // for accepting input 

            for(int i = 0; i<n; i++){
                for(int j=0; m>j; j++){
                    num[i][j] = sc.nextInt();
                }
            }
            // output 
            while(row_start <= row_end && col_start <= col_end){

                // First row 
                for(int col = col_start; col<=col_end; col++){
                    System.out.print(num[row_start][col]+" ");
                }
                row_start++;

                for(int row = row_start; row <= row_end; row++){
                    System.out.print(num[row][col_end]+" ");
                }
                col_end--;

                for(int col = col_end; col>=col_start; col--){
                    System.out.print(num[row_end][col]+" ");
                }
                row_end--;

                for( int row = row_end; row >= row_start; row--){
                    System.out.print(num[row][col_start]+" ");
                }
                col_start++;
                System.out.println();

            }
        } catch (Exception e) {
            throw e;
        }
    }
}
