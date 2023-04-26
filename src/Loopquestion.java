// sum of all the number using for loop

import java.util.Scanner;
public class Loopquestion {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
