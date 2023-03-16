import java.util.Scanner;

public class Matrixinsearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int row = sc.nextInt();
            int col = sc.nextInt();

            int num[][] = new int[row][col];

            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    num[i][j] = sc.nextInt();
                }
            }

            int search = sc.nextInt();

            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if(num[i][j] == search){
                        System.out.println("Index at"+i+" "+j+" for search value");
                    }
                }
            }

        } catch (Exception e) {
           throw e;
        }
    }
}
