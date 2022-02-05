
// METHOD ONE


// import java.io.*;
// import java.util.*;

// public class Main {
//   public static long paintHouse(int [][] arr) {
//     int n = arr.length;
//     long [][] dp = new long[n][3];
//     dp[0][0] = arr[0][0];
//     dp[0][1] = arr[0][1];
//     dp[0][2] = arr[0][2];
//     for ( int i = 1; i < n; i++) {
//       dp[i][0] = arr[i][0] + Math.min( dp[i - 1][1], dp[i - 1][2]);
//       dp[i][1] = arr[i][1] + Math.min( dp[i - 1][0], dp[i - 1][2]);
//       dp[i][2] = arr[i][2] + Math.min( dp[i - 1][0], dp[i - 1][1]);
//     }
//     long ans = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
//     return ans;
//   }

//   public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);

//     int n = scn.nextInt();
//     int [][] arr = new int[n][3];
//     for ( int i = 0; i < n; i++) {
//       for ( int j = 0; j < 3; j++) {
//         arr[i][j] = scn.nextInt();
//       }
//     }
//     long ans = paintHouse(arr);
//     System.out.println(ans);

//   }
// }



// METHOD SECOND
// Using ... Method

import java.io.*;
import java.util.*;

public class Main {
    
    public static long min(long...arr){  // Triple dot used for help of using min as function 
        long minn = (long)1e15;
        for(long x: arr)
        minn = Math.min(x, minn);
        return minn;
    }
  public static long paintHouse(int [][] arr) {
    int n = arr.length;
    long [][] dp = new long[n][3];
    dp[0][0] = arr[0][0];
    dp[0][1] = arr[0][1];
    dp[0][2] = arr[0][2];
    for ( int i = 1; i < n; i++) {
      dp[i][0] = arr[i][0] + min( dp[i - 1][1], dp[i - 1][2]); // use min as a function
      dp[i][1] = arr[i][1] + min( dp[i - 1][0], dp[i - 1][2]);
      dp[i][2] = arr[i][2] + min( dp[i - 1][0], dp[i - 1][1]);
    }
    long ans = min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    return ans;
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int [][] arr = new int[n][3];
    for ( int i = 0; i < n; i++) {
      for ( int j = 0; j < 3; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    long ans = paintHouse(arr);
    System.out.println(ans);

  }
}