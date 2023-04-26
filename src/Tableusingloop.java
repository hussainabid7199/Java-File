import java.util.Scanner;

public class Tableusingloop {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number to print its table.");
            int n = sc.nextInt();
            System.out.println("How many time you want to print the table.");
            int o = sc.nextInt();
            for(int i = 1; i<= o; i++){
                int value = n*i;
                System.out.println(n+" X "+i+" = "+value);
            }
        }catch(Exception e){
            System.out.println(e +"Error found!");
        }
    }
}
