package loops;

import java.util.*;

public class SumOfnaturalNumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        // Using while loop
        int n1 = n;
        while (n1 > 0) {
            ans = ans + n1;
            n1--;
        }
        System.out.println("The sum of n natural numbers using while loop is " + ans);

        // Resetting answer for the next calculation
        ans = 0;

        // Using for loop
        for (int i = 1; i <= n; i++) {
            ans = ans + i;
        }
        System.out.println("The sum of n natural numbers using for loop is " + ans);

        sc.close();
    }
}
