import java.util.Scanner;

public class Funprinttable {

  public static void main(Stringlearn args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a number to print its table");
      int num = sc.nextInt();
      printTable(num);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void printTable(int value) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("How may time you want to print.");
      int times = sc.nextInt();
      for (int i = 1; i <= times; i++) {
        System.out.println(value + " X " + i + " = " + value * i);
      }
    } catch (Exception e) {
      throw e;
    }
  }
}
