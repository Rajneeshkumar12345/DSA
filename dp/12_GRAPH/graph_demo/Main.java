import java.util.*;

public class Main {
    public static class Edge{   // Edge pair class
        int src;  // Source 
        int nbr;     // neighbour
        int wt;       // weight

        Edge (int src, int nbr, int wt){  // Edge construct 
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph , int u, int v, int w){

        //because of undirected graph we are adding 2 times u-v & v-u
        graph[u].add(new Edge(u, v, w));         // From u to v directed
        graph[v].add(new Edge(v, u, w));            // From v to u directed
    }

    public static void construction(){
        int N = 7;      //number of nodes / Vertex

         //Array of ArrayList and AL will contain Edge also Edge will contain (u,v,w) 
        ArrayList<Edge>[] graph = new ArrayList[N];   
        
          //This is used because we are providing (allocating) memory to our each AL
        for(int i = 0; i < N; i++){
            graph[i] = new ArrayList<>();
        }
        //as an input
        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);

        // For Display
        display(graph, N);
    }

    public static void display(ArrayList<Edge>[] graph, int N){

        //Considering every vtx
        for(int n = 0 ; n < N; n++){
            System.out.println(n + " -> " );

             //considering each edge of curr vertex
            for(Edge e : graph[n]){
                int u = e.src;
                int v = e.nbr;
                int w = e.wt;
                System.out.println(u + " - " + v + " @ " + w + " , ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        construction();
    }
}
    

