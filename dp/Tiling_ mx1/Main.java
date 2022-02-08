

import java.io.*;
import java.util.*;

public class Main {
    public static int ways(int n, int m){
        int [] dp = new int[n+1];
        for(int i = 1; i<=n; i++){
            if(i < m){
                dp[i] = 1; // only one way is possible which is vertical
            }
            else if(i == m){
                dp[i] = 2; // in this condition two way of possibe which is vertical and horizontal 
            }
            else{
                dp[i] = dp[i-1] + dp[i-m];  //  
            }
        }
        return dp[n];
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int ans = ways(n,m);
        System.out.println(ans);
    }
}








