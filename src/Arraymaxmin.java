import java.util.Scanner;

public class Arraymaxmin {

  public static void main(Stringlearn[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the length of the array.");
      int size = sc.nextInt();
      acceptInput(size);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void acceptInput(int size) {
    try (Scanner sc = new Scanner(System.in)) {
      int number[] = new int[size];
      for (int i = 0; i < number.length; i++) {
        number[i] = sc.nextInt();
      }
      minMax(number);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void minMax(int value[]) {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    for(int i = 0; i< value.length; i++){
        if(value[i] > max){
            max = value[i];
        }

        if(value[i] < min){
            min = value[i];
        }
    }

    System.out.println("Max value = "+max );
    System.out.println("Min value = "+min );
  }
}
