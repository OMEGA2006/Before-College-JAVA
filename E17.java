//Q. Make a function to multiply two numbers and return the product.

import java.util.*;

public class E17 {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of two numbers is : " + calculateProduct(a, b));
    }
}