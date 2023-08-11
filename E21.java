// Q. Make a function to print the table of a given number n.

import java.util.*;

public class E21 {

    public static void printMultiplicationTable(int n, int limit) {
        for (int i = 1; i <= limit; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int num = sc.nextInt();    // Replace this with any number for which you want to print the table
        int tableLimit = sc.nextInt();    // Replace this with the limit up to which you want to print the table

        System.out.println("Multiplication Table of " + num + " up to " + tableLimit + ":");
        printMultiplicationTable(num, tableLimit);
    }
}