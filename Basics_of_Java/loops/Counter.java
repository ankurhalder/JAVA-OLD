package loops;

import java.util.*;

public class Counter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for (int a = 0; a <= counter; a++) {
            System.out.print("\n" + a);
        }

        sc.close();
    }
}
