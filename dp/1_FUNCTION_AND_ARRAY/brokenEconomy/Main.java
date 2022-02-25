
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int [] arr = new int[n];
      for( int i = 0;i<n;i++){
          arr[i] = scn.nextInt();
      }
      int data = scn.nextInt();

      int li = 0;
      int ri = arr.length - 1;

      int floor = 0;
      int ceil = 0;
   // li move means floor move and 
   // ri move means ceil move
      while( li <= ri){
          int mid = (li + ri) / 2;
          if( arr[mid] > data){
            ri = mid - 1;
            ceil = arr[mid];
          } else if( arr[mid] < data){
              li = mid + 1;
              floor = arr[mid];
          } else if( arr[mid] == data){
              ceil = floor = arr[mid];
              break;
          }
      }
       System.out.println(ceil);
       System.out.println(floor);
    }

}