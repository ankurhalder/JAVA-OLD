package Sorting_Methods;

import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        System.out.println("Please mention the size of the array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input(n);

        generateArray(arr);
        sc.close();
    }

    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");

            arr[i] = sc.nextInt();
        }

        sc.close();

        return arr;
    }

    public static void generateArray(int[] arr) {

        System.out.println("Generated array:");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
