package Graphs;

import java.util.*;
public class DijkstraAlgorithm {
    private static void dijkstra(int[][] adjMatrix){
        int v = adjMatrix.length;
        boolean visited[] = new boolean[v];  // to mark the node visited
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < v - 1; i++){
            int minVertex = findMInVertex(distance,visited);
            visited[minVertex] = true;
            for (int j = 0; j < v; j++){
                if(adjMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex]+adjMatrix[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }
        }
        for (int i = 0; i < v; i++){
            System.out.println(i+" "+distance[i]);
        }
    }

    private static int findMInVertex(int[] distance,boolean[] visited){
        int minVertex = -1;
        for(int i = 0; i < distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex]))
                minVertex = i;
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][] = new int[v][v];
        for(int i = 0; i < e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        dijkstra(adjMatrix);
    }
}
