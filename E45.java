// Q. Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.*;

public class E45 {
    public static int toggleBit(int n, int pos) {
        // Create a bitmask with only the bit at the specified position set to 1.
        int bitmask = 1 << pos;

        // XOR the original number with the bitmask to toggle the bit.
        return n ^ bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        System.out.println("Original number : " + n);
        System.out.println("Bit position to toggle : " + pos);

        int result = toggleBit(n, pos);

        System.out.println("Number after toggling bit : " + result);
    }
}