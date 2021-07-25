
import java.io.*;
import java.util.*;

public class Graph {

    static class Edge {

        int src;
        int nb;
        int wt;

        Edge(int src, int nb, int wt) {
            this.src = src;
            this.nb = nb;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        int vces = 7;
        ArrayList<Edge> graph[] = new ArrayList[7];
        for (int i = 0; i < vces; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 1, 10));

        graph[1].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(0, 1, 10));

        graph[0].add(new Edge(0, 1, 10));
    }

}
