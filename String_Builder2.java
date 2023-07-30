import java.util.*;

public class String_Builder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        StringBuilder sb = new StringBuilder("Shlok");
        System.out.println(sb);

        sb.insert(i, 'a');
        System.out.println(sb);
    }
}