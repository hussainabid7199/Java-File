import java.util.Scanner;

public class Funevenodd {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            evenOdd(num);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void evenOdd(int value) {
        if(value%2==0){
            System.out.print(value+" is even");
        }else{
            System.out.print(value+" is odd");
        }
    }
}
