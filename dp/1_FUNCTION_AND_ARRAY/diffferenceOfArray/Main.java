
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] a1 = new int[n1];            // 345678 - a2
    for( int i = 0; i<n1 ; i++){       //   82345 - a1
        a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int [] a2 = new int[n2];
    for( int j = 0; j<n2 ; j++){
        a2[j] = scn.nextInt();
    }
    
    int [] diff = new int[n2];   // ans ka size bnaya h 
    int carry = 0;

    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while( k >= 0){ 
        int d = 0; 
        int a1val = i >= 0 ? a1[i] : 0;   // starting me a1 ke kuch idx khali hai usko manage like 0 hoge

        if( a2[j] + carry >= a1val){
            d = a2[j] + carry - a1val;
            carry = 0;
        }  else {
            d = a2[j] + carry + 10 - a1val;  // +10 karke , carry  = -1  krna h
            carry = -1;
        }
        diff[k] = d;
        i--;
        j--;
        k--;
    }
    int idx = 0;  // here we have to manage ans size of starting zero like ans = [00145] -not accept so ans is = 145
    while( idx < diff.length){
        if( diff[idx] == 0){
            idx++;
        } else {
            break;
        }
    }
    while( idx < diff.length){
        System.out.println( diff[idx]);
        idx++;
    }
 }

}
