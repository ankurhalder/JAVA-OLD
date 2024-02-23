package patterns;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop to print the inverted half pyramid
        for (int i = 1; i <= n; i++) {
            System.out.println();

            // Loop to print the numbers in each row
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print(" " + j);
            }
        }
        sc.close();
    }
}
