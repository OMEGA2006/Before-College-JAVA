// Q.  Write a program to find if a number is a power of 2 or not.

import java.util.*;

public class E44 {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if and only if it has exactly one bit set to 1.
        // Using bitwise AND with (n - 1) will clear the least significant 1-bit.
        // If the result is 0, then the number is a power of 2.
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}