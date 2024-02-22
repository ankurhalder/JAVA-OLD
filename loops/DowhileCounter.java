package loops;

import java.util.*;

public class DowhileCounter {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();

    int i = 0;
    do {
      System.out.println(i);
      i = i + 1;
    } while (i <= counter);

    sc.close();
  }
}
