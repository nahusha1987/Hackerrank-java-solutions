import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String [] strings = new String[count];
        
        for(int i = 0; i < count; i++) {
            if(in.hasNext())
                strings[i] = in.next();
        }
        
        for(int k = 0; k < count; k++) {
            print(strings[k]);
            System.out.println(" ");
        }
    }
    
    private static void print(String str) {
        for(int i = 0;  i < str.length(); i ++) {
            if(i % 2 == 0)
                System.out.print(str.charAt(i));
        }
        System.out.print(" ");
        for(int j = 0;  j < str.length(); j ++) {
            if(j % 2 != 0)
                System.out.print(str.charAt(j));
        }
    }
}