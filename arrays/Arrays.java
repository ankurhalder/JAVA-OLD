package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        // int[] marks = new int[10];
        // int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        sc.close();
    }
}
