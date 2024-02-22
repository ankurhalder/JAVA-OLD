package ExercisePartOne;

import java.util.Scanner;

public class CalcAvg {



    public static float calculateAge(float a , float b , float c ){
        float avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      float c = sc.nextFloat();
      float avg = calculateAge(a, b, c);
      System.out.println("The average of three number's are " + avg);
      sc.close();
    }
}
