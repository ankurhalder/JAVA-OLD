package advance_patterns;

import java.util.Scanner;

public class SolidRhombus {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j <= n; j++) {
                System.out.print(" " + "*");
            }
        }

        sc.close();
    }

}
