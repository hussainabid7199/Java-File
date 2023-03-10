import java.util.Scanner;

public class FuncAvg {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three number to print its average.");
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            findAverage(a, b, c);
        } catch (Exception e) {
            throw e;
        }
    }


    public static void findAverage(int value1, int value2, int value3) {
        try{
            int finalValue = value1 + value2 + value3;
            System.out.println(finalValue/3);
        } catch (Exception e) {
            throw e;
        }
    }
}
