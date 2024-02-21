package conditional;

import java.util.*;

public class OddEven {
    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number%2 == 0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");

        }
         sc.close();
    }
}
