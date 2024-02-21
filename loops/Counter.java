package loops;

import java.util.*;

public class Counter {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        
     for (int a = 1 ; a <= counter ; a++){
        System.out.println(a);
     }

        sc.close();
    }
}
