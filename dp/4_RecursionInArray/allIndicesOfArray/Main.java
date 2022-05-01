

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // fsf means that is actually count of idx where val occur and then return idx size array 
        if(idx == arr.length){
            return new int[fsf];  // new array passed  
        }
        if(arr[idx] == x){
       int [] myArr =  allIndices(arr, x, idx+1, fsf+1);
            myArr[fsf] = idx;   // fsf me idx put kr denge
            return myArr;
        } else {
           int [] myArr =  allIndices(arr, x, idx+1, fsf);
            return myArr ;
        }
    }
      
}
