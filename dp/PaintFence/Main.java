

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long same = k*1;  // Since one idx par Zero aayega joki by Default fill hai Start to fill from Second idx  
        long diff = k*(k-1);/// Start to filll from Second idx
        long total = same +diff;

        for( int i = 3;i<=n;i++){
            same = diff * 1;
            diff = total * (k-1);
            total = same + diff;
        }
        System.out.println(total);

    }

}
