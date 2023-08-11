// Q. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class E27 {
    public static String isElligible(int age) {
        if(age > 18) {
            return "Could Vote";
        }
        return "Could not Vote";
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        System.out.println(isElligible(age));
    }
}