  import java.io.*;
  import java.util.*;
   public class Main{
public static int binarySearch( int [] arr, int x){
    int li = 0;
    int ri = arr.length - 1;

    while( li <= ri){
        int mid = (li + ri) / 2;
        if( arr[mid] == x){
            return mid;
        }  else if( arr[mid] > x){
            ri = mid - 1;
        } else if( arr[mid] < x){
            li = mid + 1;
        }
    }
    return -1;
  }

      public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int [] arr = new int[n];
      for( int i = 0;i<n;i++){
          arr[i] = scn.nextInt();
      }
      int x = scn.nextInt();
      int ans = binarySearch(arr, x);
      System.out.println(ans);
    
  }
}
