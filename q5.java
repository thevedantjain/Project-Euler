import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long ans = 1;
            int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
            for (int i=0; i<=13; i++) {
                if(arr[i] <= n) {
                    int k=1;
                    while(Math.pow(arr[i], k+1) <= n) {
                        k++;
                    }
                    ans *= Math.pow(arr[i],k);
                }
                else {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
