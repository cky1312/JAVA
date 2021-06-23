package Graphs;
import java.util.*;

public class Graph_1 {
    int V;
    LinkedList<Integer>[] vertex;

    Graph_1(int v){
        V = v;
        vertex = new LinkedList[V];
    }

    public void addEdge(int u, int v, boolean b){
        vertex[u].add(v);
        if(b){
            vertex[v].add(u);
        }
    }

    public void printAdjList(){
        for(int i=0;i<V;i++){
            System.out.print("->");
            for(int node:vertex[i]){
                System.out.print(node+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            Graph_1 g = new Graph_1(4);
            g.addEdge(0, 1, true);
            g.addEdge(0, 2, true);
            g.addEdge(0, 3, true);
            g.addEdge(1, 3, true);
            g.addEdge(3, 2, true);

            g.printAdjList();
        }
        catch (Exception e){

        }
    }
}
