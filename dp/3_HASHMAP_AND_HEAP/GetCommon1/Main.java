

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] a = new int[n1];
    for(int i = 0; i<n1; i++){
        a[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] b = new int[n2];
    for(int i= 0; i<n2; i++){
        b[i] = scn.nextInt();
    }
    HashMap<Integer, Integer> hm = new HashMap<>();
    for( int val : a){
        if( hm.containsKey(val)){
            int of = hm.get(val);
            int nf = of + 1;
            hm.put(val, nf);
        }
        else {
            hm.put(val, 1);
        }
    }
    for( int val : b){
        if( hm.containsKey(val)){
            System.out.println(val);
            hm.remove(val);
        }
    }
  }

}



// Second Mehtod

// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n1 = scn.nextInt();
//     int [] a = new int[n1];
//     for(int i = 0; i<n1; i++)
//         a[i] = scn.nextInt();

//     int n2 = scn.nextInt();
//     int [] b = new int[n2];
//     for(int i= 0; i<n2; i++)
//         b[i] = scn.nextInt();

    
//     // FreqMap of A array
//     HashMap<Integer, Integer> hm = new HashMap<>();
//     for(int ele : a)
//         hm.put(ele, hm.getOrDefault(ele , 0 )+ 1);
    
//     for(int ele : b){
//         if(hm.containsKey(ele)){
//             System.out.println(ele);

//             //remove
//             hm.remove(ele);
//         }
//     }


//  }

// }
