import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void solve(double n) {
        System.out.println(0);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int queries;
        double n;
        queries = scanner.nextInt();
        while(queries>0) {
            n = scanner.nextDouble();
            solve(n);
            queries--;
        }
    }
}
