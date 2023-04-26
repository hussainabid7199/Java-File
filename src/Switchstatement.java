import java.util.Scanner;

public class Switchstatement {

  public static void main(Stringlearn args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter your destination.");
      System.out.println("1 For delhi");
      System.out.println("2 For mumbai");
      System.out.println("3 For patna");
      System.out.println("4 For kolkata");
      int button = sc.nextInt();
      int weight, price, totalAmount;
      switch (button) {
        case 1:
          System.out.println("Thank you! You have selected delhi.");
          System.out.println("Enter the weight of your goods. Per kg 5 Rs.");
          weight = sc.nextInt();
          price = weight * 5;
          totalAmount = price;
          System.out.println("You need to pay Rs." + totalAmount);
          break;
        case 2:
          System.out.println("Thank you! You have selected mumbai.");
          System.out.println("Enter the weight of your goods. Per kg 9 Rs.");
          weight = sc.nextInt();
          price = weight * 9;
          totalAmount = price;
          System.out.println("You need to pay Rs." + totalAmount);
          break;
        case 3:
          System.out.println("Thank you! You have selected patna.");
          System.out.println("Enter the weight of your goods. Per kg 2 Rs.");
          weight = sc.nextInt();
          price = weight * 2;
          totalAmount = price;
          System.out.println("You need to pay Rs." + totalAmount);
          break;
        case 4:
        System.out.println("Thank you! You have selected kolkata.");
          System.out.println("Enter the weight of your goods. Per kg 4 Rs.");
          weight = sc.nextInt();
          price = weight * 4;
          totalAmount = price;
          System.out.println("You need to pay Rs." + totalAmount);
          break;
        default:
          System.out.println("wrong input");
          break;
      }
    } catch (Exception error) {
      System.out.println(error);
    }
  }
}
