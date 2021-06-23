package Graphs;

import java.util.HashMap;

public class Graph_Client {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "D", 10);
        graph.addEdge("B", "C", 7);
        graph.addEdge("C", "D", 9);
        graph.addEdge("D", "E", 15);
        graph.addEdge("E", "F", 22);
        graph.addEdge("E", "G", 17);
        graph.addEdge("F", "G", 25);

//        graph.display();
//
//        System.out.println(graph.numVertex());
//        System.out.println(graph.numEdges());
//
//        System.out.println(graph.containsVertex("F"));
//        System.out.println(graph.containsVertex("X"));
//
//        System.out.println(graph.containsEdge("C","A"));
//        System.out.println(graph.containsEdge("A","X"));
//
//        graph.removeEdge("A","B");
//        graph.display();
//
//        graph.removeVertex("A");
//        graph.display();
//
//        graph.addVertex("X");
//        graph.display();
//
//        graph.addEdge("B", "X", 12);
//        graph.display();
        System.out.println(graph.hasPath("A","F",new HashMap<>()));
        graph.dft();

    }
}
