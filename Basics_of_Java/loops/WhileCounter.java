package loops;

import java.util.*;

public class WhileCounter {
  public static void main(String Args[]) {

    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int i = 0;
    while (i <= counter) {
      System.out.println(i);
      i = i + 1;
    }
    sc.close();
  }
}
