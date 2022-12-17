// Program to find Even or Odd

import java.util.*;
public class Evenodd {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to find even or odd = ");
            int number = sc.nextInt();
            if(number % 2 == 0){
                System.out.println(number + " is an even number.");
            }else{
                System.out.println(number + " is an odd number.");
            }
        }catch(Exception error){
            System.out.println("Error Found = "+error);
        }
    }
}
