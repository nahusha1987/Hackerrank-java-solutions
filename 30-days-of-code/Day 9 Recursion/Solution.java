import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(factorial(n));
    }
    
    private static int factorial(int n) {
        if (n <= 1) 
            return 1;
        return n * factorial(n-1);
       
    }
}