//Q. Print the table of n till m.

import java.util.*;

public class E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i = 1;
        for(i = 1; i <= m; i++) {
        System.out.println(n * i);
        }
    }
}