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
            long sum = 0;
            long first = 0, second = 2, third = 0;
            while(n>=second) {
                sum+=second;
                third = 4*second+first;
                first = second;
                second = third;
            }
            System.out.println(sum);
        }
    }
}
