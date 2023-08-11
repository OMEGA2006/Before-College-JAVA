// Q. Print the Greeting
//     1 == Hello
//     2 == Namaste
//     3 == Bonjour

import java.util.*;

public class E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1) {
            System.out.println("Hello");
        } else if(button == 2) {
            System.out.println("Namaste");
        } else if(button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }
    }
}