import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            factorialOfNum(number);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void factorialOfNum(int value) {
        if(value < 0){
            System.out.println("Invalid Input");
            return;
        }
        int factorial = 1;
        for(int i = 1; i<=value; i++){
          factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
}
