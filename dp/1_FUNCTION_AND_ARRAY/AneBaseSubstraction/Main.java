


import java.util.*;
  
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
 }

 public static int getDifference(int b, int n1, int n2){
     int ans = 0, c = 0 , pow = 1;
     while( n2 > 0){
         int d1 = n1 % 10;
         n1 = n1 / 10;
          int d2 = n2 % 10;
         n2 = n2 / 10;

         int d = 0;
         d2 = d2 + c;
         if( d2 >= d1){
             c = 0;
             d = d2 - d1;
         }
         else {
             c = -1;
             d = d2 + b - d1;
         }
     ans = ans + d * pow;
     pow = pow * 10;
     }
     return ans;

 }

}
