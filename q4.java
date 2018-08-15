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
            int a=0;
            outer:
            for(int i=100; i<1000; i++) {
                for(int j=100; j<1000; j++) {
                    int p = i*j;
                    int temp = p;
                    int rev=0;
                    while(temp>0) {
                        rev = rev*10 + temp%10;
                        temp/=10;
                    }
                    if((p == rev)&&(p < n)&&(p>a)) {
                        a=p;
                    }
                }
            }
            System.out.println(a);
        } 
    }
}
