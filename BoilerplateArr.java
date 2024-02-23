import java.util.*;

public class BoilerplateArr {
    public static void main(String[] args) {
        System.out.println("Please mention the size of the array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the input method to get user input for the array elements
        int[] arr = input(n);

        // Perform all the operation's here
        // Call the generateArray method to generate and print the array
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
