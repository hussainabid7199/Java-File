import java.util.Scanner;

public class Funfibonacci {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int num =  sc.nextInt();
            fibonacciSeries(num);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public static void fibonacciSeries(int value) {
        int x = 1;
        int y = 0;
        System.out.println(y);
        for(int i =0; i<=value; i++){
            int c =x+y;
            x=y;
            y=c;
            System.out.println(c);
        }
    }
}


