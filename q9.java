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
        int prod = -1;
        for (int a=3; a<n/3; a++){
            for (int c=n/3; c<n/2; c++) {
                int b = n - a - c;
                if ((a*a+b*b) == c*c) {
                    if (a*b*c > prod)
                        prod = a*b*c;
                    }
                }
            }
            System.out.println(prod);
        }
    }
}
