package Graphs;

import java.util.ArrayList;

public class AdjacencyList_Representation {
    // Add an edge
    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d){
        am.get(s).add(d);
        am.get(d).add(s);
    }
    public static void main(String[] args) {
        // Create the Graph
        int v = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<>(v);
        for(int i = 0; i < v; i++){
            am.add(new ArrayList<>());
        }
        // Add edges
        addEdge(am, 0, 1);
        addEdge(am, 1, 2);
        addEdge(am, 0, 2);
        addEdge(am, 0, 3);
        addEdge(am, 2, 4);
        addEdge(am, 3, 4);

        printGraph(am);
    }

    // Print the Graph
    static void printGraph(ArrayList<ArrayList<Integer>> am){
        for(int i = 0; i < am.size(); i++){
            System.out.print("\nVertex " + i + ":");
            for(int j = 0; j < am.get(i).size(); j++){
                System.out.print(" -> "+ am.get(i).get(j));
            }
            System.out.println();
        }
    }
}
