import java.util.Scanner;

public class Funradius {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the radius of circle");
            float radius = sc.nextFloat();
            findRadius(radius);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void findRadius(Float value) {
        double circum = 2 * 3.14 * value;
        System.out.println(circum);   
    }
}
