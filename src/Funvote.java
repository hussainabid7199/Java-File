import java.util.Scanner;

public class Funvote {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter your age."); 
           int age = sc.nextInt();
            findEligibility(age);
        } catch (Exception e) {
            throw e;
        }
    }


    public static void findEligibility(int value) {
        if(value >= 18){
            System.out.println("Eligible to vote");
        }        else{
            System.out.println("Underage not eligible to vote");
        }
    }
}
