
	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int [] val = new int[n];
          for( int i = 0;i<val.length;i++){
              val[i] = scn.nextInt();
          }
          int [] wt = new int[n];
          for( int i = 0;i<wt.length;i++){
              wt[i] = scn.nextInt();
          }
          int cap = scn.nextInt();
          
          int [] dp = new int[cap+1];
          
          dp[0] = 0;                   // 0 bag ke liye store
          
          for(int bag = 1;bag<=cap;bag++){
              int max = 0;
              for( int i = 0;i<n;i++){
                  if(wt[i] <= bag){                // Check wt Bag me aa jayega
                      int remaining = bag - wt[i];    // Let Bag ki capacity jyada ho to remaining wt se jo optimal value ho jo ki dp pahle se store hai
                      int remOptimalVal = dp[remaining];
                      int myOptimal = val[i] + remOptimalVal;
                      
                      if( myOptimal > max){
                          max = myOptimal;
                      }
                  }
              }
              dp[bag] = max;
          }
          System.out.println(dp[cap]);  // Maximum capacity ko return kr dunga
          
	    }
	}
