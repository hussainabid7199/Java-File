import java.util.Scanner;

public class Funsumoddnum {

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(
        "Enter the last number to calculate the sum of all the odd no"
      );
      int num = sc.nextInt();
      sumOfOdd(num);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void sumOfOdd(int value) {
    int sum = 0;
    for (int i = 0; i <= value; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
        sum = sum + i;
      }
    }
    System.out.println(sum);
  }
}
