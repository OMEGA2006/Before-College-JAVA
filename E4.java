// Q. Make a program that takes the radius of a circle as input, calculates its diameter and area and prints it as output to the user.

import java.util.*;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int d = 2 * r;
        double A = 3.14 * r * r;

        System.out.println(d);
        System.out.println(A);
    }
}