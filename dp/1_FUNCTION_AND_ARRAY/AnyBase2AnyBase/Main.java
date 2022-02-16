

import java.util.*;
  
public class Main{

   public static int getValueInDec(int n, int b){
   int pow = 1, ans = 0;
   while( n > 0){
       int rem = n % 10;
       n = n / 10;
      ans = ans + rem * pow;
      pow = pow * b;
   }
   return ans ;
}


  public static int getValueInBase(int n, int b){
     int pow = 1, ans = 0;
     while( n > 0){
         int rem = n % b;
         n = n / b;
        ans = ans + rem * pow;
        pow = pow * 10;
     }
     return ans ;
 }

public static int getValue( int n, int b1, int b2){
 int dec = getValueInDec(n, b1);
 int dc = getValueInBase(dec, b2);
 return dc;
}

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
   int  destBase= scn.nextInt();

   int ans = getValue(n, sourceBase, destBase);
   System.out.println(ans);
 }   
}
