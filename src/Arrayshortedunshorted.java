import java.util.Scanner;

public class Arrayshortedunshorted {

  public static void main(Stringlearn[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int size = sc.nextInt();
      acceptInput(size);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void acceptInput(int inputSize) {
    try (Scanner sc = new Scanner(System.in)) {
      int number[] = new int[inputSize];
      System.out.println("Enter your data.");
      for (int i = 0; i < number.length; i++) {
        number[i] = sc.nextInt();
      }

      boolean isAcending = true;
    } catch (Exception e) {
      throw e;
    }
  }
}
