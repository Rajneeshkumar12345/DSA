
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();

    long OB = 1;  // old buildings
    long OS = 1;  // old space

    for ( int i = 2; i <= n; i++) {
      long NB = OS;  // new buildings
      long NS = OS + OB;  // new space

      OB = NB;
      OS = NS;

    }
      long total = OB + OS;
      total = total * total;
    System.out.println(total);
  }

}
