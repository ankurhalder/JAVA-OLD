package input;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        // Input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // nextInt()
        // nextDouble() and more
        // System.out.println(name);
        // sc.close(); 

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
        sc.close();
    }
}
