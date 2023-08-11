// Q. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^𝑛.

import java.util.*;

public class E31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        double result = P(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }

    public static double P(double x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }

        // If n is negative, calculate the reciprocal of x^(|n|) to handle negative exponents.
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1;
        while (n > 0) {
            // If n is odd, multiply the result by x
            if (n % 2 == 1) {
                result *= x;
            }
            // Reduce n by half and square x
            x *= x;
            n /= 2;
        }
        return result;
    }
}
