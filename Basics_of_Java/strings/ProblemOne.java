package strings;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Strings you want to add in the Array?");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + "th String:");
            arr[i] = sc.nextLine();
        }

        String allString = "";
        for (int i = 0; i < n; i++) {
            allString = arr[i] + allString;
        }

        int size = allString.length();
        System.out.println("The length of the cumulative (combined) length of all those strings is " + size);
        sc.close();
    }
}
