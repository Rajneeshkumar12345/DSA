import java.io.*;
import java.util.*;

public class Main {
    
    public static int coinChangeCombination(int [] arr, int amt){
        int [] dp = new int[amt+1]; 
        dp[0] = 1;
        for(int i = 0;i<arr.length;i++){ // one by one arr ke idx ko travel krana h by which order maintain rhe
            for( int j = 1;j<dp.length;j++){ // dp ke idx hai
                if(j - arr[i] >= 0){
                    dp[j] += dp[j - arr[i]]; // current dp ke idx ka value nikal kar jo bacha hoga usse previous store dp me search krege if mila to add kr dege
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
        int ans = coinChangeCombination(arr, amt);
        
        System.out.println(ans);

    }
}

