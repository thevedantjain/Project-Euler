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
            long n = in.nextLong();
            while ((n%2==0)&&(n/2>2)) {
                n/=2;
            }
            int i;
            for(i=3; i<=Math.sqrt(n);i=i+2) {
                while ((n%i==0)&&(n/i>2)) {
                    n/=i;
                }
            }
            if (n>2)
                System.out.println(n);
            else
                System.out.println(i-2);
        }
    }
}
