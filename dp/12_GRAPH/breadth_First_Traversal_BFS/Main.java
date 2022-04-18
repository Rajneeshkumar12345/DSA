

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   static class Pair {  // Made Pair class which is store u and asf
       int u;               // it mean basically src
       String asf;          // it is path
       
       Pair(int u, String asf) {        // Constructor
           this.u = u;
           this.asf = asf;
       }
   } 
   
   public static void bft(ArrayList<Edge>[] graph, int src){
       boolean [] vis = new boolean[graph.length]; // For marking  true made a 1-d array 
       Queue<Pair> qu = new LinkedList<>();  // Made a queue 
       
       qu.add(new Pair(src, src+ "")); 
       
       while(qu.size() != 0){
           Pair rem = qu.remove();
           
           if(vis[rem.u]){
               continue;
           }
           vis[rem.u] = true;
           System.out.println(rem.u+ "@"+ rem.asf);
           
           for(Edge e : graph[rem.u]){
               int nbr = e.nbr;
               if(!vis[nbr]){
                   qu.add(new Pair(nbr, rem.asf+nbr));
               }
           }
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      bft(graph, src);
   }
}
