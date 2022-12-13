// To find the area, perimeter and diagonal of a traingle.

public class Rectangle {
    public static void main(String args[]) {
        int l, b, ar, per;
        double d;
        l = 20;
        b = 40;
        ar = l * b;
        per = 2*(l + b);
        d = Math.sqrt(l*l + b*b);
        System.out.println("The area of rectangle is "+ ar);
        System.out.println("The perimeter of rectangle is "+ per);
        System.out.println("The digonal of rectangle is "+ d);
    }
}
