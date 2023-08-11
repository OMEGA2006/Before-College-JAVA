// Q. Write a program to count the number of 1’s in a binary representation of the number.

import java.util.*;

public class E46 {
    public static int countOnes(int n) {
        int c = 0;
        while (n != 0) {
            // Use bitwise AND to check the least significant bit (LSB)
            // If the LSB is 1, increment the count
            c += n & 1;
            // Right shift the number by 1 position to check the next bit
            n >>= 1;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Number : " + n);
        
        int countOfOnes = countOnes(n);
        
        System.out.println("Number of 1's in binary representation : " + countOfOnes);
    }
}