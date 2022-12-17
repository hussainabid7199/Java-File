// Program to take an integer input as Age and find out Adult or Not

import java.beans.Expression;
import java.util.*;

public class Conditanal {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Your Age.");
            int age = sc.nextInt();
            if(age < 18){
                System.out.println("Not an Adult");
            } else{
                System.out.println("You Are an Adult");
            }
        }catch (Exception error){
            System.out.println("Error Found = "+ error);
        }
    }
}
