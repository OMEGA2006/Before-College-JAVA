import java.util.*;

public class for_0_and_1_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        //outer loop
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) { //even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}