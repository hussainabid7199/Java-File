import java.util.Scanner;

public class Fungreatest {
    public static void main(Stringlearn[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            findGreatest(a, b);
        } catch (Exception e) {
           throw e;
        }
    }

    public static void findGreatest(int value1, int value2) {
        if(value1 == value2){
            System.out.println(value1+ " equal "+value2);
        }
        else if(value1 > value2){
            System.out.println(value1+ " is greater then "+value2);
        }
        else{
            System.out.println(value2+ " is greater then "+value1);
        }
    }
}
