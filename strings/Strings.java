package strings;

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Initiate
        StringBuilder sb = new StringBuilder("Ankur Halder");
        Scanner sc = new Scanner(System.in);
        // print
        System.out.println(sb.charAt(0));

        // update
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // add
        sb.insert(1, "o");
        System.out.println(sb);

        sc.close();
    }
}
