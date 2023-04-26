import java.util.Scanner;

public class Loops {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number, how many time you want to run the loops.");
            int input = sc.nextInt();
            for(int i = 0; i<=input; i++){
                System.out.print(i+" ");
            }

        }catch(Exception error){
            System.out.println(error);
        }
    }
}
