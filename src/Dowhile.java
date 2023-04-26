import java.util.Scanner;
public class Dowhile {
    public static void main(Stringlearn args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 10);
        }catch(Exception error){
            System.out.println(error);
        }
    }
}
