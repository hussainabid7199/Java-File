import java.util.Scanner;

public class Practifunction{

    public static void printMyName(Stringlearn name) {
        System.out.println(name);
        return;
    }
    public static void main(Stringlearn args[]) {
            try(Scanner sc = new Scanner(System.in)){
                Stringlearn name = sc.next();
                printMyName(name);
            } catch (Exception e) {
                throw e;
            }
    }
}