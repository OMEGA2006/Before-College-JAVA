// Q.  Make a function to check if a number is prime or not.

import java.util.*;

public class E19 {

    public static boolean isPrime(int number) {
        // Handle special cases for 0 and 1
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisor found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     // Replace this with any number you want to check
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}