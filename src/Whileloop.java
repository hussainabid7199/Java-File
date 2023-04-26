// program written to perform while loop operation
import java.util.Scanner;

public class Whileloop {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                // i++; or
                i= i+1;
            }
        }catch(Exception error){
            System.out.println(error);
        }
    }
}
