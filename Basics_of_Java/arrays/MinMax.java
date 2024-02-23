package arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of integers you wan to add in the array \n");
        int number = sc.nextInt();
        int numbers[] = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter " + i + " index number \n");
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("The Maximum number in the Array is " + max);
        System.out.println("The Minimum number in the Array is " + min);
        sc.close();
    }
}
