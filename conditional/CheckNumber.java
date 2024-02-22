package conditional;

import java.util.*;

public class CheckNumber {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a == b) {
         System.out.println("Both are same");
      } else if (a > b) {
         System.out.println(a + "is grater than" + b);
      } else {
         System.out.println(b + "is greater than" + a);
      }
      sc.close();
   }
}
