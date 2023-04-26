// Write a program to print the following pattern using for loop.

// 12345
// 1234
// 123
// 12
// 1


import java.util.Scanner;

public class Reversenumpiramid {
    public static void main(Stringlearn args[]) {
        try (Scanner sc =new Scanner(System.in)){
        int n = 5;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println(); 
        }

        } catch (Exception e) {
            throw e;
        }
    }
}
