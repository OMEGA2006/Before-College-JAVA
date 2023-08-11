// Q. Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;

public class E33 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcdResult = GCD(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcdResult);
    }

    public static int GCD(int a, int b) {
        
        // Ensure that both a and b are positive integers

        a = Math.abs(a);
        b = Math.abs(b);

        // Implement the Euclidean algorithm to find GCD

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}