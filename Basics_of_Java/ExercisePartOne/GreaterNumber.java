package ExercisePartOne;

import java.util.Scanner;

public class GreaterNumber {

    public static int greaterNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greaterNumber = greaterNumber(a, b);
        System.out.println("Between " + a + " and " + b + " Greater Number is " + greaterNumber);
        sc.close();
    }
}
