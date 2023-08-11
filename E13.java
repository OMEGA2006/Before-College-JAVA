// Q.  Print all even numbers till n.

import java.util.*;

public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        for(i = 0; i <= n ; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}