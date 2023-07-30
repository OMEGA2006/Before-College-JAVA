import java.util.*;

public class Strings3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // compare
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        // C1 => n1 > n2 : +ve value
        // C2 => n1 == n2 : 0
        // C3 => n1 < n2 : -ve value

        int comparison = name1.compareTo(name2);
        System.out.println(comparison);

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}