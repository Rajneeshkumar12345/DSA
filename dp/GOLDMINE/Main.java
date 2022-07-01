
import java.io.*;
import java.util.*;

public class Main {
    public static int goldMineTab( int [][] grid, int [][] dp){
        int n = grid.length;
        int m = grid[0].length;
        
        for( int j = m-1;j>=0;j--){
            for( int i = 0;i<n;i++){
              if( j == m-1){
                  dp[i][j] = grid[i][j];
              }  
              else if( i == 0){
                  int op1 = dp[i][j+1];
                  int op2 = dp[i+1][j+1];
                  int max = Math.max( op1, op2);
                  dp[i][j] = max + grid[i][j];
              }
              else if( i == n-1){
                   int op1 = dp[i][j+1];
                  int op2 = dp[i-1][j+1];
                  int max = Math.max( op1, op2);
                  dp[i][j] = max + grid[i][j];
              }
              else {
                  int op1 = dp[i-1][j+1];
                  int op2 = dp[i][j+1];
                  int op3 = dp[i+1][j+1];
                  int max = Math.max( op1, op2);
                  dp[i][j] = grid[i][j] + Math.max( max, op3);
              }
            }
        }
        int ans = 0;
        for( int i = 0;i<n;i++){
            if( dp[i][0] > ans){
                ans = dp[i][0];
            }
        }
        return ans;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] grid = new int[n][m];
        for( int i = 0;i<n;i++){
            for( int j = 0;j<m;j++){
                grid[i][j] = scn.nextInt();
            }
        }
        int [][]dp = new int[n][m];
        int ans = goldMineTab( grid, dp);
        System.out.println( ans);
    }

}