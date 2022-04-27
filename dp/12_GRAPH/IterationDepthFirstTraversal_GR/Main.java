

import java.io.*;
import java.util.*;

public class Main {
    static class pair{
        int v;
        String psf;
        
        pair(){}
        pair(int v, String psf){
            this.v = v;
            this.psf = psf;
        }
    }
   static class Edge {
      int src;
      int nbr;

      Edge(){}
      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   public static void IterationDFT(ArrayList<Edge> [] graph, int src){
       Stack<pair> st = new Stack<>();
       st.push(new pair(src, src+ ""));
       
       int n = graph.length;
       boolean [] vis = new boolean[graph.length];
       
       while(st.size() != 0){
           pair rem = st.pop();
           
           if(vis[rem.v] == true){
               continue;
           }
           
           vis[rem.v] = true;
           System.out.println(rem.v+ "@" +rem.psf);
           for(Edge e : graph[rem.v]){
              int nbr = e.nbr;
              if(vis[nbr] == false){
                  st.push(new pair(nbr, rem.psf + nbr));
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
        IterationDFT(graph, src);
       
   }
}
