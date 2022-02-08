

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int k = scn.nextInt();

//         long same = k*1;  // Since one idx par Zero aayega joki by Default fill hai Start to fill from Second idx  
//         long diff = k*(k-1);/// Start to filll from Second idx
//         long total = same +diff;

//         for( int i = 3;i<=n;i++){
//             same = diff * 1;
//             diff = total * (k-1);
//             total = same + diff;
//         }
//         System.out.println(total);

//     }

// }



// using function method


import java.io.*;
import java.util.*;

public class Main {
    public static int ways(int n, int k){

        int [][] dp = new int[2][n+1];
        // where two parametr are going to change then we will make 2D dp
        for(int i = 2; i<=n; i++){
            if(i == 2){
                dp[0][i] = k;
                dp[1][i] = k*(k-1);
                continue;
            } 
            dp[0][i] =  dp[1][i-1];
            dp[1][i] = (k-1)*(dp[0][i-1] + dp[1][i-1]);
        }



        return dp[0][n] + dp[1][n];

    }

    public static int ways_(int n, int k){

        int xx = k;
        int xy = k*(k-1);

        for(int i = 3; i<=n; i++){
            
            int nxx =  xy;
            int nxy = (k-1)*(xx + xy);

            xx = nxx;
            xy = nxy;
        }
        return xx + xy;

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int ans = ways_(n,k);
        System.out.println(ans);
    }
}
