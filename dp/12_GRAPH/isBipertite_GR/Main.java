
import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static class Pair{
       int vtx;
       String psf;
       int level;
       
       Pair(int vtx, String psf, int level){
           this.vtx = vtx;
           this.psf = psf;
           this.level = level;
       }
   }
   
   public static boolean checkComponentForBipertite(ArrayList<Edge>[] graph, int src, int [] vis){
       Queue<Pair> qu = new LinkedList<>();
       qu.add(new Pair(src, src+"", 0));
       
       while(qu.size() != 0){
           Pair rem = qu.remove();
           if(vis[rem.vtx] != -1){
               if(rem.level != vis[rem.vtx]){
                   return false;
               }
           } else {
               vis[rem.vtx] = rem.level;
           }
           
           for(Edge e : graph[rem.vtx]){
               int nbr = e.nbr;
               if(vis[nbr] == -1){
                   qu.add(new Pair(nbr, rem.psf + nbr, rem.level + 1));
               }
           }
       }
       return true;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
        
        int [] vis = new int[vtces];
        Arrays.fill(vis, -1);
     for(int i = 0; i < vtces; i++){
         if(vis[i] == -1){
             boolean isCompBipertite = checkComponentForBipertite(graph, i, vis);
             if(isCompBipertite){
                 System.out.println(true);
                 return;
             }
         }
     }
     System.out.println(false);
     
   }
}


// Second Method using vertex and color****************************************

class Solution {
    
    /*
    -1 unvis
    1 blue
    0 red
    
    */
    
    public class pair{
        int vtx;
        int clr;
        
        pair(){}
        pair(int vtx, int clr){
            this.vtx = vtx;
            this.clr = clr;
        }
        
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] vis = new int[n];
        Arrays.fill(vis, -1);
        
        
        for(int v = 0; v < n; v++){
            if(vis[v] == -1){
                
                
                Queue<pair> qu = new LinkedList<>();
                qu.add(new pair(v,0));

                while(qu.size()!= 0){
                    int size = qu.size();
                    while(size-- > 0){
                        pair rem = qu.remove();

                        if(vis[rem.vtx] != -1){
                            //vis
                            if(vis[rem.vtx] == rem.clr)
                                continue;
                            else{
                                return false;
                            }
                        }
                        vis[rem.vtx] = rem.clr;
                        int src = rem.vtx;
                        for(int e : graph[src]){
                            if(vis[e] == -1){
                                qu.add(new pair(e, 1 - rem.clr));       //(1+rem.clr)%2;
                            } 
                        }   

                    }
                }
            }
        }
        
        
        
       return true; 
        
    }
}
