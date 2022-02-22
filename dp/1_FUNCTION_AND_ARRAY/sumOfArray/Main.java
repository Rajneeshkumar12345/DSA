
import java.io.*;
import java.util.*;

public class Main{
    public static void sumOfArray( int [] A, int [] B){
     
     int n = A.length;
     int m = B.length;
     int carry = 0;

     int size = ( n > m) ? n : m;
     int [] ans = new int[size];

     int i = n-1;
     int j = m-1;
     int k = ans.length - 1;

     while( k >= 0){
         int sum = 0;
         sum = sum + carry;
     if( i >= 0){
         sum = sum + A[i];
     }
     if( j >= 0){
         sum = sum + B[j];
     }
     int val = sum % 10;
     carry = carry / 10;

     ans[k] = val;
      i--;
      j--;
      k--;
}
    if( carry != 0){
        System.out.println( carry);
    }
    for( int ele : ans){
        System.out.println(ele);
    }

    }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] A = new int[n];
    for( int i = 0; i<n ; i++){
        A[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int [] B = new int[m];
    for( int j = 0; j<m ; j++){
        B[j] = scn.nextInt();
    }
    
         sumOfArray(A, B);
    

    }
 

}