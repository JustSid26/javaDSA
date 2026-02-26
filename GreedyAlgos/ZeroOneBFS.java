package GreedyAlgos;
import java.util.*;

public class ZeroOneBFS {

    private static class Vertex {
        int dest;
        int weight;

        public Vertex(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private static final int numVertex = 9;

    @SuppressWarnings("unchecked")
    private List<Vertex>[] edges = new ArrayList[numVertex];

    public ZeroOneBFS() {
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v, int wt) {
        edges[u].add(new Vertex(v, wt));
        edges[v].add(new Vertex(u, wt));
    }

    public void BFS(int src) {

        int[] dist = new int[numVertex];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> queue = new ArrayDeque<>();

        dist[src] = 0;
        queue.addLast(src);

        while (!queue.isEmpty()) {

            int v = queue.removeFirst();

            for (int i = 0; i < edges[v].size(); i++) {

                int neighbor = edges[v].get(i).dest;
                int weight = edges[v].get(i).weight;

                if (dist[neighbor] > dist[v] + weight) {

                    dist[neighbor] = dist[v] + weight;

                    if (weight == 0)
                        queue.addFirst(neighbor);
                    else
                        queue.addLast(neighbor);
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.println("Distance to " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        ZeroOneBFS graph = new ZeroOneBFS();

        graph.addEdge(0, 1, 0);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 0);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 0);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 5, 0);
        graph.addEdge(4, 6, 1);
        graph.addEdge(5, 7, 0);
        graph.addEdge(6, 7, 1);
        graph.addEdge(7, 8, 0);

        System.out.println("Shortest distances from source 0:");
        graph.BFS(0);
    }
}
