

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int [] dp0 = new int[n+1];
    int [] dp1 = new int[n+1];
    // Since dp[0] = 0 , by default So i have required to fill  start at dp[1]
    
    dp0[1] = 1;
    dp1[1] =1 ;
    
    for( int i = 2;i<=n;i++){
        dp0[i] = dp1[i-1];
        dp1[i] = dp0[i-1] + dp1[i-1];
    }
    System.out.println( dp0[n] + dp1[n]);
    
 }

}


// Second Method


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int OCZeros = 1;  // OldCountZeros
    int OCOnes = 1;  // OldCountOnes
    
    for( int i = 2;i<=n;i++){
        int NCZeros = OCOnes;
        int NCOnes = OCZeros + OCOnes;
        
        OCOnes = NCOnes;  // Oldones ko NewOnes krna pdega
        OCZeros = NCZeros; // oldzeros ko NewZeros krna pdega
    }
    System.out.println(OCZeros + OCOnes);
    
 }

}
