import java.util.*;

public class String_Builder3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        StringBuilder sb = new StringBuilder("Shlok");
        System.out.println(sb);

        sb.insert(i, 'a');
        System.out.println(sb);

        // delete a
        int j = sc.nextInt();
        int k = sc.nextInt();
        sb.delete(j, k);
        System.out.println(sb);
    }
}