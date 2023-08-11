// Q. Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
    
//     1 : + (Addition) a + b
//     2 : - (Subtraction) a - b
//     3 : * (Multiplication) a * b
//     4 : / (Division) a / b
//     5 : % (Modulo or remainder) a % b

//     Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        
        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter your choice: ");
        int operation = sc.nextInt();
        
        double result;
        
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                result = a % b;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error: Invalid operation choice.");
        }
    }
}