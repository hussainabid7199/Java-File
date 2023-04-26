import java.util.Scanner;

public class Functionmulti {

  public static void main(Stringlearn args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      int value1 = sc.nextInt();
      int value2 = sc.nextInt();
      System.out.println("Product of two number = "+ productOfTwo(value1, value2));
    } catch (Exception e) {
      throw e;
    }
  }

  public static int productOfTwo(int value1, int value2) {
    return value1 * value2;
  }
}
