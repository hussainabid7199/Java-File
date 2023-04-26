import java.util.Scanner;

public class Funprime {
    public static void main(Stringlearn args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
           primeNo(num);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void primeNo(int value) {
        int count = 0;
        for(int i =1; i<= value; i++){
            if(value%i == 0){
             count++;
            }
        }
        if(count==2){
            System.out.println(+value+" is a prime no.");
        }else{
            System.out.println(+value+" is not a prime no.");
        }
    }
}
