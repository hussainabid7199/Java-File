import java.util.Scanner;

public class Halfpiramid {
    public static void main(Stringlearn args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int n = 4;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
