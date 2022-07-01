

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for( int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int include = arr[0];
        int exclude = 0;

        for( int i = 1;i<n;i++){
            int newInclude = arr[i] + exclude;
            int newExclude = Math.max( include, exclude);

            include = newInclude;
            exclude = newExclude;
         
        }
        int ans = Math.max( include, exclude);
        System.out.println(ans);

    }
}
