import java.util.*;

public class Update_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); 
        // update bit to 1 else update bit to 0
        // oper = 1 => set oper
        // oper = 0 => clear oper
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}