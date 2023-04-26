import java.util.Scanner;

public class Zeroonetriangle {
    public static void main(Stringlearn args[]) {
        try (Scanner sc = new Scanner(System.in)){
            int n = 5;
            // int number = 1;
            for(int i=1; i<= n; i++){
                for(int j=1; j<=i; j++){
                    int sum = i+j;
                    if(sum %2 == 0){
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                    // number++;

                }
                System.out.println();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}