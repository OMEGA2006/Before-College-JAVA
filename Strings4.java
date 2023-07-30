import java.util.*;

public class Strings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int i = sc.nextInt();
        int j = sc.nextInt();

        String name = sentence.substring(i,j);
        
        System.out.println(name);
    }
}