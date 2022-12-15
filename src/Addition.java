import java.util.*;

public class Addition {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter two number to perform addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("The addition of "+ a +" and "+ b +" = "+ c);
    } catch (Exception error) {
        System.out.println("Error Found { " + error + " }");
    }
  }
}
