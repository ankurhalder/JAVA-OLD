package advance_patterns;

import java.util.*;

public class Butterfly {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      // First Upper Half
      for (int i = 1; i <= n; i++) {
         // First part
         for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*");
         }
         int spaces = 2 * (n - i);
         // Spaces
         for (int j = 1; j <= spaces; j++) {
            System.out.print(" " + " ");
         }
         // 2nd part
         for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*");
         }
         System.out.println();
      }
      // Lower half
      for (int i = n; i >= 1; i--) {
         // First part
         for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*");
         }
         int spaces = 2 * (n - i);
         // Spaces
         for (int j = 1; j <= spaces; j++) {
            System.out.print(" " + " ");
         }
         // 2nd part
         for (int j = 1; j <= i; j++) {
            System.out.print(" " + "*");
         }
         System.out.println();
      }
   }
}
