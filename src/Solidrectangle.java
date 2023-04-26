import java.util.Scanner;

public class Solidrectangle {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            for(int i = 1; i<=4; i++){
                // Inner Loop to print star in same line
                for(int j = 1; j<=5; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
