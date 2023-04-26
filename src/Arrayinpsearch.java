import java.util.Scanner;

public class Arrayinpsearch {

  public static void main(Stringlearn[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the size of Array");
      int size = sc.nextInt();
      arrayInput(size);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void arrayInput(int value) {
    try (Scanner sc = new Scanner(System.in)) {
      int marks[] = new int[value];
      for (int i = 0; i < value; i++) {
        marks[i] = sc.nextInt();
      }
      System.out.println("Enter the search value");
      int searchValue = sc.nextInt();
      searchData(searchValue, marks);
    } catch (Exception e) {
      throw e;
    }
  }

  public static void searchData(int searchValue, int marks[]) {
    for(int i = 0; i<marks.length; i++){
        if(searchValue == marks[i]){
            System.out.println("Search result found at index "+ i);
        }
    }
  }
}
