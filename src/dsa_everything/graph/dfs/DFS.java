package dsa_everything.graph.dfs;

import java.util.LinkedList;

public class DFS {
    int vertices;
    LinkedList<Integer>[] adjLinkedList;

    void dfs(int sVertex) {
        boolean[] visited = new boolean[vertices];
        dfsRecursion(sVertex, visited);
    }

    void dfsRecursion(int sVertex, boolean[] visited) {
        visited[sVertex] = true;
        for (int adj : adjLinkedList[vertices]) {
            if (!visited[adj]) {
                dfsRecursion(adj, visited);
            }
        }
    }
}
