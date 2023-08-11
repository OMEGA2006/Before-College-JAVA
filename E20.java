// Q. Make a function to check if a given number n is even or not.

import java.util.*;

public class E20 {

    public static boolean isEven(int n) {
        // If the number is divisible by 2, it's even
        return (n % 2) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     // Replace this with any number you want to check
        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }
}