package patterns;

import java.util.Scanner;
public class HollowRectangle {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     sc.close();

     for(int i = 1 ; i <= n ; i ++){
        System.out.print("\n");
        for (int j = 1; j <= n ; j++){
            if(i == 1 || i == n || j == 1 || j == n)
            System.out.print("*");
            else
            System.out.print(" ");
        }
     }
     }
    }

