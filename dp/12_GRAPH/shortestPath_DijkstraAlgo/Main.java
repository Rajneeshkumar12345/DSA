
import java.io.*;
import java.util.*;

public class Main {
    static class dp{
        int v;
        String psf;
        int wsf;
        
        dp(){}
        dp(int v, String psf, int wsf){
            this.v = v;
            this.psf = psf;
            this.wsf = wsf;
        }
    }
    
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

    public static void shortestPath(ArrayList<Edge> [] graph, int src){
        int n = graph.length;
        PriorityQueue<dp> pq = new PriorityQueue<>((a, b)->{
            return a.wsf - b.wsf;
    });
    
    boolean [] vis = new boolean[n];
    pq.add(new dp(src, src + "", 0));
    
    while(pq.size() != 0){
        dp rem = pq.remove();
        
        if(vis[rem.v] == true){
            continue;
        }
        
        vis[rem.v] = true;
        System.out.println(rem.v + " via " + rem.psf + " @ " + rem.wsf);
        for(Edge e : graph[rem.v]){
            int nbr = e.nbr;
            if(vis[nbr] == false){
                pq.add(new dp(nbr, rem.psf + nbr, rem.wsf + e.wt));
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      shortestPath(graph, src);
      
   }
}


// No use function method ***************************


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

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vtces = Integer.parseInt(br.readLine());
    ArrayList< Edge>[] graph = new ArrayList[vtces];
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

    int src = Integer.parseInt(br.readLine());
    boolean[] visited = new boolean[vtces];

    PriorityQueue< Pair> queue = new PriorityQueue<>();
    queue.add(new Pair(src, src + "", 0));

    while (queue.size() > 0) {
      Pair rem = queue.remove();

      if (visited[rem.v] == true) {
        continue;
      }
      visited[rem.v] = true;
      System.out.println(rem.v + " via " + rem.psf
                         + " @ " + rem.wsf);

      for (Edge e : graph[rem.v]) {
        if (visited[e.nbr] == false) {
          queue.add(new Pair(e.nbr,
                             rem.psf + e.nbr, rem.wsf + e.wt));
        }
      }
    }
  }

  static class Pair implements Comparable< Pair> {
    int v;
    String psf;
    int wsf;

    Pair(int v, String psf, int wsf) {
      this.v = v;
      this.psf = psf;
      this.wsf = wsf;
    }

    public int compareTo(Pair o) {
      return this.wsf - o.wsf;
    }
  }
}


