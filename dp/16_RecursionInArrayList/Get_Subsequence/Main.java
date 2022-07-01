
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            ArrayList<String> ans = gss(s);
            System.out.println(ans);
    }

    public static ArrayList<String> gss(String s) {
        if(s.length() == 0){
         ArrayList<String> base = new ArrayList<>();
         
         base.add("");
         return base;
        }
        char ch = s.charAt(0); // ch me faith ko add kr dunga that means ch = a
        String ros = s.substring(1); // Faith b->c
        
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();
        
        for(String ele : recAns){
            myAns.add(ele);  // Faith ans diya 
        }
        
        for(String ele : recAns){
            myAns.add(ch + ele);    // Faith ko meet krakr apne ch me one by one add kr liya  
        }
        
        return myAns;
        
    }

}
