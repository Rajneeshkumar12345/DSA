
import java.util.*;
  
public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
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
}
