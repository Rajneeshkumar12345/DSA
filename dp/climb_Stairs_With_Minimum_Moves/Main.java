

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Integer[] dp = new Integer[n + 1]; // isme pahle se null store rhta
    dp[n] = 0;  // last idx me koi moves possible nhi hai

    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] > 0){
      int min = Integer.MAX_VALUE; /// bhut saari value padi ho like - 1, 2, 4, 6, 7, 9,5......
      for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
        if (dp[i + j] != null) {
          min = Math.min(min, dp[i + j]); // bhut saari value se mujhe min chahiye hoga
        }
      }
      if (min != Integer.MAX_VALUE)
        dp[i] = min + 1; // if sabhi me null pda ho to koe ways hi nhi hai to min +1 hoga 
    }
  }
}
    System.out.println(dp[0]);
    
  }

// Second Method

//   import java.io.*;
// import java.util.*;

// public class Main {

//     // public static void main(String[] args) throws Exception {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();

    //     int [] arr = new int[n];
    //     for( int i = 0;i<n;i++){
    //         arr[i] = scn.nextInt();
    //     }
    //     Integer [] dp = new Integer[n+1];
    //     dp[n] = 0;
    //    for(int i = n-1;i >= 0;i--){
    //        if( arr[i] > 0){
    //        int min = Integer.MAX_VALUE;
    //        for( int j = 1;j <= arr[i] && i+j <dp.length;j++){
    //            if(dp[i+j] != null){
    //                min = Math.min(min, dp[i+j]);
    //            }
    //        }
    //        if(min != Integer.MAX_VALUE){
    //            dp[i] = min + 1;
    //        }
    //    }
    //    }
    // System.out.println(dp[0]);
    //   }
    // }

