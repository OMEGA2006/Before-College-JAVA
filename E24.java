// Q. Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.*;

public class E24 {
    public static float getGreater(float a, float b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        System.out.println(getGreater(a, b));
    }
}