import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Upper Half
        //outer loop
        for(int i = 1; i <= n; i++) {
            //1st part
            //inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        //outer loop
        for(int i = n; i >= 1; i--) {
            //1st part
            //inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}