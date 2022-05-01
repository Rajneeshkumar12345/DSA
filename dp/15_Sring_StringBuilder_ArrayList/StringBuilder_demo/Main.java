import java.util.*;


public class Main {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);                         // Hello 

        char ch = sb.charAt(0); ///  For get 
        System.out.println(ch);                     // H

        sb.setCharAt(0, 'd');   /// For update 
        System.out.println(sb);                    //   dello               

        sb.insert(2, 'y');      // For insert
        System.out.println(sb);                     // deyllo

        sb.deleteCharAt(2);         // Remove
        System.out.println(sb);                     // dello

        sb.append('g');             // Append
        System.out.println(sb);                     // dellog

        System.out.println(sb.length()); // Length   // 6

    }
    
}
