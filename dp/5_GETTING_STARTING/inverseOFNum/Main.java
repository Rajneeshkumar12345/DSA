

import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int inver = 0;
    int op = 1;    // original position
    while( n != 0){
      int od = n%10;  // original digits
      int ip = od;  // inverse position
      int id = op;   // inverse digits;

      inver = inver +id * (int)Math.pow(10, ip-1);

      n /= 10;
      op++;
    }
    System.out.println(inver);
 }
}
