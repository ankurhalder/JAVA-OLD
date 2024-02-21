package patterns;
import java.util.*;
public class InvertedHalfPyramid3 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i ++){
            System.out.println("");
            for(int j = 1 ; j <= n - 1 ; j ++){
                System.out.print(" ");
            }
            for(int j = n ; j >= i  ; j --){
                System.out.print("*");
            }
        }
        sc.close();
       
    }
}
