// Q.  Write a function that takes in the radius as input and returns the area of a circle.

import java.util.*;

public class E26 {
    public static double calculateArea(double r) {
        double A = 3.14 * r * r;
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double A = calculateArea(r);
        System.out.println("Area of circle is : " + A);
    }
}