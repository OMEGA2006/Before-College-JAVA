// Q. Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [

import java.util.*;

public class E47 {
    public static String decimalToBinary(int decimalNumber) {
            // Function to convert a decimal number to binary
        if (decimalNumber == 0) {
            return "0"; // Special case for decimal number 0
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            // Get the remainder (0 or 1) when dividing the number by 2
            int remainder = decimalNumber % 2;
            // Add the remainder to the binary string (in reverse order)
            binary.insert(0, remainder);
            // Divide the number by 2 to check the next bit
            decimalNumber /= 2;
        }
        return binary.toString();
    }

    // Function to convert a binary number to decimal
    public static int binaryToDecimal(String binaryNumber) {
        int decimal = 0;
        int power = 0;

        // Traverse the binary string from right to left
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char bit = binaryNumber.charAt(i);
            // Convert the character '0' or '1' to an integer (0 or 1)
            int bitValue = Character.getNumericValue(bit);
            // Add the bit value multiplied by 2^power to the decimal number
            decimal += bitValue * Math.pow(2, power);
            // Increment the power for the next bit position
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.println(decimalNumber + " in binary: " + binaryRepresentation);

        String binaryNumber = sc.next();
        int decimalValue = binaryToDecimal(binaryNumber);
        System.out.println(binaryNumber + " in decimal: " + decimalValue);
    }
}