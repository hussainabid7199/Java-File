// Program to compare two number is = , > or < ;

import java.util.*;
public class Comparision {
    public static void main(Stringlearn args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your first number = ");
            int first = sc.nextInt();
            System.out.print("Enter your second number = ");
            int second = sc.nextInt();

            if(first == second){
                System.out.println("The entered number "+ first + " is equal to " + second);
            }else if(first > second){
                System.out.println("Number "+ first +" is greater than "+ second);
            }else{
                System.out.println("Number "+ second +" is greater than "+ first);
            }
        }catch (Exception error){
            System.out.println("Error Found = "+ error);
        }
    }
}
