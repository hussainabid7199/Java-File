import java.util.Scanner;
public class Concatination {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)){
            String firstName = "Abid";
            String lastName = "Hussain";
            String fullName = firstName + lastName;
            System.out.println(fullName);
        } catch (Exception e) {
            throw e;
        }
    }
}
