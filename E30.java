// Q. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^𝑛.

import java.util.*;

public class E30 {
    public static void main(String args[]) {
        
        System.out.println("Enter value of x : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        
        System.out.println("Enter value of n : ");
        double n = sc.nextDouble();
        
        double result = 1;

//Please see that n is not too large or else result will exceed the size of int

        for(double i=0; i<n; i++) {
            result = result * x;
        }

        System.out.println("x to the power n is : "+ result);
    }
}