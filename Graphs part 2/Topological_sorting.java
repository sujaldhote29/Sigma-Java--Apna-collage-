/*
 * 
 * Topological Sorting
Directed Acyclic Graph(DAG) is a directed graph with no cycles.
Topological sorting is used only for DAGS (not for non-DAGs)
It is a linear order of vertices such that every directed edge u -> v,
the vertex u comes before v in the order.
 */

import java.util.*;

public class Topological_sorting {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topsort(ArrayList<Edge> graph[]){
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                topsortUtil(graph,i,visit,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topsortUtil(ArrayList<Edge> graph[],int curr , boolean visit[], Stack<Integer> s){
        visit[curr]= true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
           if (!visit[e.dest]) {
            topsortUtil(graph, e.dest, visit, s);
           }
        }

        s.push(curr);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topsort(graph);
    }
}
