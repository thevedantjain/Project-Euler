import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int prod = 0;
            String num = in.next();
            for (int index=0; index<(n-k); index++) {
                String sub = num.substring(index, index+k);
                int temp = 1;
                for(int i=0; i<k; i++) {
                    temp *= Integer.parseInt(sub.substring(i, i+1));
                }
                if (temp > prod)
                    prod = temp;
            }
            System.out.println(prod);
        }
    }
}
