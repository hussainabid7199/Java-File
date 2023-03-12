import java.util.Scanner;

public class Funcvalueofraisednum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two number to find is raised value, i.e. 10^2");
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            findRaisedValue(a, b);
        } catch (Exception e) {
            throw e;
        }
    }


    public static void findRaisedValue(int value1, int value2) {
        int sum = 1;
        for(int i = 1; i<=value2; i++){
            sum = sum * value1;
        }
        System.out.println(sum);
    }
}
