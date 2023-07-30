import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop
        //upper half
        for(int i = 1; i <= n; i++) {
            //inner loop
            //spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i = n; i >= 1; i--) {
            //spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}