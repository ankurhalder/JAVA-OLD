package patterns;

import java.util.*;

public class SolidRectangle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
   for (int i = 0; i <= n; i ++){
    System.out.print("\n");
     for (int j = 0; j <= n; j ++){
           System.out.print(" *");
     }
   }
   sc.close();
  }


}
