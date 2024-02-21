package loops;

import java.util.*;
public class HelloWorld {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int counter = 0; counter < x ; counter = counter + 1){
          System.out.println("Hello World");
        }
        sc.close();
    }
}
