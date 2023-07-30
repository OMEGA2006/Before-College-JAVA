import java.util.*;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your First Name is : ");
        String firstName = sc.next();
        
        System.out.print("Your Last Name is : ");
        String lastName = sc.next();
        
        //concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Your Name is : " + fullName);
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}