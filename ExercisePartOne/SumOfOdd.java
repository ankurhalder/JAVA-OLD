package ExercisePartOne;

import java.util.Scanner;



public class SumOfOdd {

    public static int sumOffOdd(int n){
        int sum = 0;
        for (int i = 0; i<= n ; i ++){
          if(i%2 != 0){
           sum = sum + i;

          }
        }
        return sum;
    }
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = sumOffOdd(n);
      System.out.println("sum of all odd numbers from 1 to "+ n +" is " + sum);
   
      sc.close();
    }
}
