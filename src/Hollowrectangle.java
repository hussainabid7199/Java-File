import java.util.Scanner;

public class Hollowrectangle {
    public static void main(Stringlearn[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int n = 4;
            int m = 5;
            for(int i = 1; i<=n; i++){
                for(int j = 1; j<=m; j++){
                    if(i == 1 || i == n || j == 1 || j == m){
                        System.out.print("*");
                    }
                    else{
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




// khazanchiPatna80780@