import java.util.Scanner;

public class Functionsum {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            int sum = sumOfTwoNum(num1, num2);
            System.out.println(sum);
        } catch (Exception e) {
            throw e;
        }
    }

    public static int sumOfTwoNum(int value1, int value2) {
        int sum = value1 + value2;
        return sum;
    }
}
