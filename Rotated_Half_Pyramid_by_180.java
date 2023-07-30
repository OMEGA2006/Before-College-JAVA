import java.util.*;

public class Rotated_Half_Pyramid_by_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //outer loop
        for(int i = 1; i <= n; i++) {
            //inner loop => Space print
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //inner loop => star print
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
