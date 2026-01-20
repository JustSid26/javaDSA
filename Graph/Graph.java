package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import Arrays.stockPrice;

public class Graph {
    private int numVertices; //this is the size of the array
    private List<Integer>[] adjacencyList;

    //constructor
    public Graph(int numVertices){
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for(int i = 0; i < numVertices; i++){
            adjacencyList[i]=new LinkedList<>();
        }
    }

    //add edge to the graph(relation)
    public void addEdge(int source, int destination){
        adjacencyList[source].add(destination);
        //for undirected graph -
        adjacencyList[destination].add(source);
    }

    public void BFS(int startVertex){
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.println(vertex + " ");
            for(int neighbor : adjacencyList[vertex]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void DFS(int startVertex){
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
    }
    public void DFSUtil(int vertex, int boolean[] visited){
        visited[vertex] = true;
        System.out.println(vertex + " ");
        for(int neighbor: adjacencyList[vertex]){
            if(!visited[neighbor]){
                DFSUtil(neighbor, visited);
            }
        }
    }
    public void DFSIterative(int startVertex){
        boolean visited[] = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        while(!stack.isEmpty()){
            int vertex = stack.pop();
            System.out.println(vertex+ " ");
            for(int neighbor : adjacencyList[vertex]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }
    public static void main(String args[]){
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("BFS starting from vertex : 0");
        graph.BFS(0);
        System.out.println("DFS starting from vertext : 0");
        graph.DFS(0);
        System.out.println("DFS starting from vertex: 0, but iterative");
        graph.DFSIterative(0);
    }
}
