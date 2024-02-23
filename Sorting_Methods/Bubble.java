package Sorting_Methods;

import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        System.out.println("Please mention the size of the array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input(n);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

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

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
