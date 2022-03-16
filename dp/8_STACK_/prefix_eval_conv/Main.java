
import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack< Integer> vs = new Stack< >();      //1   // value
    Stack< String> is = new Stack< >();        // infix
    Stack< String> ps = new Stack< >();    // In PreStack we could find PostStack 

    for (int i = exp.length() - 1; i >= 0; i--) {
      char ch = exp.charAt(i);   //2

      if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { //3
        int v1 = vs.pop();
        int v2 = vs.pop();
        int val = operation(v1, v2, ch);
        vs.push(val);

        String iv1 = is.pop();     //4
        String iv2 = is.pop();
        String ival = "(" + iv1 + ch + iv2 + ")";
        is.push(ival);

        String pv1 = ps.pop(); //5
        String pv2 = ps.pop();
        String pval = pv1 + pv2 + ch;
        ps.push(pval);
      } else {
        vs.push(ch - '0'); //6
        is.push(ch + "");
        ps.push(ch + "");
      }
    }
    System.out.println(vs.pop());    //7
    System.out.println(is.pop());
    System.out.println(ps.pop());
  }
  public static int operation (int v1, int v2, char op) {  //8


    if (op == '+') {
      return v1 + v2;
    } else if (op == '-') {
      return v1 - v2;
    } else if (op == '*') {
      return v1 * v2;
    } else {
      return v1 / v2;
    }

  }
}