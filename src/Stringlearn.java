import java.util.Scanner;

public class Stringlearn {

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.nextLine();
        // String name = sc.next();
        System.out.println(name);
    } catch (Exception e) {
      throw e;
    }
  }
}
