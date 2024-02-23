package TwoDArrays;

import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows " + " ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Enter number of columns " + " ");
        int column = sc.nextInt();
        System.out.println();
        int twoDArray[][] = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\n" + "Enter number for " + i + " " + j + "th position" + " ");
                twoDArray[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                // System.out.print("\n" + "Enter number for " + i + " " + j + "th position");
                // twoDArray[i][j] = sc.nextInt();
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
