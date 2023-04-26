import java.util.Scanner;

public class Halfpiramidinverted180 {
    public static void main(Stringlearn args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int n = 4;
            for(int i = 1; i<=n; i++){
                // Inner loop to print space
                for(int j = 1; j<= n-i; j++){
                    System.out.print(" ");
                }

                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }

        } catch (Exception e) {
            throw e;
        }
    }    
}
