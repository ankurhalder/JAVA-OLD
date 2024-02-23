import java.util.*;

public class BoilerplateArr {
    public static void main(String[] args) {
        System.out.println("Please enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = input(n);

        // Perform all the operations here with the inputted array
        generateArray(arr);
        sc.close();
    }

    // This function takes the size of the array as input and returns the array
    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        return arr;
    }

    // This function takes an array as input and generates the array
    public static void generateArray(int[] arr) {
        System.out.println("Generated array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
