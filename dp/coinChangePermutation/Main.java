import java.io.*;
import java.util.*;

public class Main {
    public static int coinChangePermutation(int [] arr, int amt){
        int [] dp = new int [amt+1];
        dp[0] = 1; 
        
        for(int j = 1;j<dp.length;j++){  // 1 se start hai because 0 pr phle se 1 store kr liya h extra call mhi lgana chahta
            // one by one dp ke idx pr arr ke sabhi idx ko travel krana hai // here no matter order
            for( int i = 0;i<arr.length;i++){
                if(j - arr[i] >= 0){
                    dp[j] += dp[j - arr[i]];
                }
            }
        }
        return dp[amt];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int amt = scn.nextInt();
        int ans = coinChangePermutation(arr, amt);
        
        System.out.println(ans);

    }
}
