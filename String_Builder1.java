import java.util.*;

public class String_Builder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        StringBuilder sb = new StringBuilder("Shlok");
        System.out.println(sb);

        // char at index i
        System.out.println(sb.charAt(i));

        // set char at index i
        sb.setCharAt(i, 'j');
        System.out.println(sb);
    }
}