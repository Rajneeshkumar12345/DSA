
import java.io.*;
import java.util.*;

public class Main{
    
    public static void subset( int [] arr){
        
        int n = arr.length;
         int total = (int)Math.pow(2, n);
        for( int i = 0 ; i < total;i++){
            
        
        String s  = " ";
          int temp = i;
        for( int j = n-1; j >= 0;j--){
            // every i will go j from right to left 
            int r = temp % 2;
            temp /= 2;
            if( r == 0){
               s = "-\t" + s; 
            } else {
                s = arr[j] + "\t" + s;
            }
        }
        System.out.println(s);
    }
}
public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0 ; i<n; i++){
        arr[i]=scn.nextInt();
    }
    subset(arr);
 }

}