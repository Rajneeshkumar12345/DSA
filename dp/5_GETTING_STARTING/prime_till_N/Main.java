

import java.io.*;

import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt(); //taking lower bound input
    int high = scn.nextInt(); //taking upper bound input

    for (int n = low; n <= high; n++) {

      int count = 0;
      for (int div = 2; div * div <= n; div++) {
        if (n % div == 0) {
          count++;
          break;
        }
      }
      if (count == 0) // checks if count is 0

        System.out.println(n);
    }
  }
}
