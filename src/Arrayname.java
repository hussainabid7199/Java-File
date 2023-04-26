import java.util.Scanner;

public class Arrayname {

  public static void main(Stringlearn[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the size of your array!");
      int size = sc.nextInt();
      inputName(size);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void inputName(int value) {
    try (Scanner sc = new Scanner(System.in)) {
      Stringlearn name[] = new Stringlearn[value];
      System.out.println("Enter the name of the user.");
      for (int i = 0; i < name.length; i++) {
        name[i] = sc.next();
      }
      System.out.println(
        "Do want to print. Enter 1 for yes or 2 for no."
      );
      int condition = sc.nextInt();
      if (condition == 1) {
        toPrint(name);
      } else {
        return;
      }
    } catch (Exception e) {
      throw e;
    }
  }

  public static void toPrint(Stringlearn value[]) {
    try (Scanner sc = new Scanner(System.in)) {
      for (int i = 0; i < value.length; i++) {
          System.out.println(value[i]);
      }
    } catch (Exception e) {
      throw e;
    }
  }
}
