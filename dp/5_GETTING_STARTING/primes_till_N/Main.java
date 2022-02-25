
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt(); //taking lower bound input
    int high = scn.nextInt(); //taking upper bound input

    for (int n = low; n <= high; n++) {

      //try and create a filter to pass through prime
      //numbers down to the printing command


      //print command for prime numbers
      System.out.println(n);
    }
  }
}