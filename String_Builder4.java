import java.util.*;

public class String_Builder4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("S");
        sb.append("h");     //str = str + "h";
        sb.append("l");     //str = str + "l";
        sb.append("o");     //str = str + "o";
        sb.append("k");     //str = str + "k";
        System.out.println(sb);
        System.out.println(sb.length());
    }
}