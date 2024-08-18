package dsa_everything.graph.adjacency_list;

import java.util.LinkedList;

import dsa_everything.graph.Graph;

public class AdjacencyList {
    int vertices;
    LinkedList<Integer>[] adjacencyList;

    AdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void insert(int src, int dest) {
        adjacencyList[src].add(dest);
        // If the graph is undirect
        adjacencyList[dest].add(src);
    }

    void display() {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer edge : adjacencyList[i]) {
                System.err.print(edge + " ");
            }
        }
    }

    public static void main(String[] args) {
           // Create a graph with 5 vertices
           AdjacencyList adjacencyList = new AdjacencyList(5);

        // Add edges
        adjacencyList.insert(0, 1);
        adjacencyList.insert(0, 4);
        adjacencyList.insert(1, 2);
        adjacencyList.insert(1, 3);
        adjacencyList.insert(1, 4);
        adjacencyList.insert(2, 3);
        adjacencyList.insert(3, 4);

        // Display the graph
        adjacencyList.display();
    
    }
}
