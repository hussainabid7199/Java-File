import java.util.Scanner;

public class Fundowhile {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int i = 10;
            do {
                System.out.println("It's infinite loop "+ i);
                i++;
            } while (i >= 10);
        } catch (Exception e) {
            throw e;
        }
    }
}
