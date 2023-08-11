// Q. Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class E25 {
    public static double calculatePerimeter(double r) {
        double P = 2 * 3.14 * r;
        return P;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double P = calculatePerimeter(r);
        System.out.println("Perimeter of circle is : " + P);
    }
}