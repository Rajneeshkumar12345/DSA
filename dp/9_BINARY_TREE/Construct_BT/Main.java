
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);  // Left and right ko  null kiya and first index se node bnaya

    Pair rtp = new Pair(root, 1);  //Made a Pair which is name of RootPair ko stack me push krege 

    Stack<Pair> st = new Stack<>(); // Stack bnaya which is take a Pair 
    st.push(rtp);                   //  RootPair ko st me push kiya

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();  // made a Pair name of Top which is take node and State
      if (top.state == 1) {
        idx ++;             // Arr ke idx ko increase kiya
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);  // Left node bnaya and for that node left and right ko null kiya 
          Pair lp = new Pair(top.node.left, 1);  // Ek Pair bnaya which is left 
          st.push(lp);   // And here Pair ko st me push kiya 
        } else {
          top.node.left = null; // If arr idx has a null data then put null into the left node
        }
        top.state ++;  // and last increse the state which is present in the Stack

      } else if ( top.state == 2) {
        idx ++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }
          top.state ++;
      } else if ( top.state == 3) {
        st.pop();
      }
    }
    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }


    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += "  <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);
    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
    if (node == null) {
      return 0;
    }
    int ls = size(node.left);
    int rs = size(node.right);
    return ls + rs + 1;
  }

  public static int sum(Node node) {
    if (node == null) {
      return 0;
    }
    int ls = sum(node.left);
    int rs = sum(node.right);
    return ls + rs + node.data;
  }

  public static int max(Node node) {
    if ( node == null) {
      return 0;
    }
    int lm = max(node.left);
    int rm = max(node.right);
    int myAns = Math.max(lm, rm);

    return Math.max(myAns, node.data);
  }

  public static int height(Node node) {
    if ( node == null) {
      return -1;
    }
    int lh = height(node.left);
    int rh = height(node.right);

    return Math.max(lh, rh) + 1;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht);
  }

}
