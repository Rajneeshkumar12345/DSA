
import java.io.*;
import java.util.*;

public class Main {
    
    
    public static int zeroOneKnapSack(int cap, int [] wt, int [] val){
        int [][] dp = new int[wt.length+1][cap + 1];
        int n = dp.length;
        int m = dp[0].length;
        
        // travel in dp
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                if(j == 0){
                    dp[i][j] = 0;
                }
                else if( i == 0 ){
                    dp[i][j] = 0;
                }
                else{
                    int noCall = dp[i-1][j];
                    
                    int yesCall = -1;
                    
                    if(j - wt[i-1] >= 0){
                        yesCall = dp[i-1][j-wt[i-1]] + val[i-1] ;
                    }
                    dp[i][j] = Math.max(yesCall, noCall);
                }
                      
            }
            
        }
        return dp[n-1][m-1];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] value = new int[n];
        for(int i = 0; i<n; i++){
            value[i] = scn.nextInt();
        }
        int [] wt = new int[n];
        for(int i = 0; i<n; i++){
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int ans = zeroOneKnapSack(cap, wt, value);
        System.out.println(ans);
        
    }
}


/// Second method

int [][] dp = new int[n+1][cap+1];

for( int i = 1;i<dp.length;i++){
    for( int j = 1;j<dp[0].length;j++){
        if( j >= wts[i-1]){  // wts Mini ball  h uss idx pr and j run bnana h it means iski batting tabhi aayegi jab j Score jyada ho
            int rCap = j - wts[i-1]; // it  means uss idx ke khelne k baad bachi ball  then next iteration me remaining capacity
            // ball ko lekar [i-1] team play kregi 
            if( dp[i-1][rCap] + vals][i-1] > dp[i-1][j]){ // if idx khela aur remaining capacity ball pr [i-1] team run bnane k baad
                // if vah jyda h Score, idx ke na khelne pr toh yahi max hoga
                dp[i][j] = dp[i-1][rCap] + vals][i-1];
            } 
            else {
                dp[i][j] = dp[i-1][j]; // i does not bat
            }
        }
        else {
            dp[i][j] = dp[i-1][j];// i does not bat
        }
    }  
}

