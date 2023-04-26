import java.util.Scanner;

public class Arrspiral {
    public static void main(Stringlearn[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int row = sc.nextInt();
            int col = sc.nextInt();

            int spiral[][] = new int[row][col];


            // Input 
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    spiral[i][j] = sc.nextInt();
                }
            }

            // Output 

            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                   System.out.print(spiral[i][j]+ " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            throw e;
        }
    }
}
