import java.util.Scanner;

public class Floydstraingle {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int n = 5;
            int number = 1;
            for(int i=1; i<= n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
