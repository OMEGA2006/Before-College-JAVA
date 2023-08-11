//Q. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;

public class E38 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        //input
        //rows
        for(int i = 0; i < rows; i++) {
            //columns
            for(int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                //compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at locations (" + i + ", " + j + ")");
                }
            }
        }
    }
}